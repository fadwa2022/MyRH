package com.example.myrh.services;

import com.example.myrh.model.dto.request.CompanyRequestDTO;
import com.example.myrh.model.dto.response.CompanyResponseDTO;

public interface CompanyService {
    CompanyResponseDTO registerCompany(CompanyRequestDTO companyRequest);
    CompanyResponseDTO sendVerificationCode(String email);

}
