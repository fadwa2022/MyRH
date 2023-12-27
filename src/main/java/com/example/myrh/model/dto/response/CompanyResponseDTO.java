package com.example.myrh.model.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyResponseDTO {
    private String companyId;
    private String address;
    private String email;
    private String phone;
    private String image;
    private String verificationCode;
}