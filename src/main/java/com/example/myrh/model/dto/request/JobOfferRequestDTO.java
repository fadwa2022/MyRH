package com.example.myrh.model.dto.request;

import com.example.myrh.model.entity.Company;
import com.example.myrh.model.entity.JobOffer;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobOfferRequestDTO {
        @NotBlank(message = "title is required")
        private String title;
        @NotBlank(message = "description is required")
        private String description;
        @NotBlank(message = "job profile is required")
        private String jobProfile;
        @NotBlank(message = "city is required")
        private String city;
        @NotBlank(message = "education level is required")
        private String educationLevel;
        @NotBlank(message = "salary is required")
        private String salary;
        private boolean approved;
        private Long companyId;
        public JobOffer toModel(){

                Company company = Company
                        .builder()
                        .companyId(companyId)
                        .build();

                return JobOffer
                        .builder()
                        .title(title)
                        .description(description)
                        .jobProfile(jobProfile)
                        .city(city)
                        .educationLevel(educationLevel)
                        .salary(salary)
                        .approved(approved)
                        .companyOffred(company)
                        .build();

        }
}

