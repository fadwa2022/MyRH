package com.example.myrh.controller;

import com.example.myrh.model.dto.request.CompanyRequestDTO;
import com.example.myrh.model.dto.response.CompanyResponseDTO;
import com.example.myrh.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    @PostMapping("/register")
    public ResponseEntity<CompanyResponseDTO> registerCompany(@RequestBody CompanyRequestDTO companyRequest) {
        CompanyResponseDTO responseDTO = companyService.registerCompany(companyRequest);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
    @PostMapping("/send-verification-code")
    public ResponseEntity<CompanyResponseDTO> sendVerificationCode(@RequestParam String email) {
        CompanyResponseDTO companyResponse = companyService.sendVerificationCode(email);
        return new ResponseEntity<>(companyResponse, HttpStatus.OK);
    }
}