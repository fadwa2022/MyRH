package com.example.myrh.model.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobOfferResponseDTO {
    private String offerId;
    private String title;
    private String description;
    private String jobProfile;
    private String city;
    private String educationLevel;
    private String salary;
    private boolean approved;
    private CompanyResponseDTO company;

}