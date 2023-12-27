package com.example.myrh.services.Impl;

import com.example.myrh.exception.CompanyAlreadyExistsException;
import com.example.myrh.model.dto.request.CompanyRequestDTO;
import com.example.myrh.model.dto.response.CompanyResponseDTO;
import com.example.myrh.model.entity.Company;
import com.example.myrh.repository.CompanyRepository;
import com.example.myrh.services.CompanyService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;

import java.util.Random;

@AllArgsConstructor
@Service
public class CompanyServiceImp implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private final ModelMapper modelMapper;
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public CompanyResponseDTO registerCompany(CompanyRequestDTO companyRequest) {

        Company company =modelMapper.map(companyRequest, Company.class);
        Company companyExist=companyRepository.findCompanyByEmail(company.getEmail());
        if (companyExist==null){
            company = companyRepository.save(company);
            return    modelMapper.map(company,
                    CompanyResponseDTO.class);
        }else {
            throw new CompanyAlreadyExistsException("Company with email " + company.getEmail() + " already exists");
        }

    }

    @Override
    public CompanyResponseDTO sendVerificationCode(String email) {
        Company companyExist=companyRepository.findCompanyByEmail(email);
        if (companyExist!=null){
            String verificationCode = generateVerificationCode();
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(email);
            message.setSubject("Company Registration Verification Code");
            message.setText("Your verification code is: " + verificationCode);

            javaMailSender.send(message);
           CompanyResponseDTO companyResponse = modelMapper.map(companyExist,CompanyResponseDTO.class);
           companyResponse.setVerificationCode(verificationCode);
            return companyResponse;
        }else {
            throw new CompanyAlreadyExistsException("Company with email " + email + " not exists");
        }

    }
    private String generateVerificationCode() {
        Random random = new Random();
        int verificationCode = 100000 + random.nextInt(900000);
        return String.valueOf(verificationCode);
    }
}
