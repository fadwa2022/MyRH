package com.example.myrh.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
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
    }

