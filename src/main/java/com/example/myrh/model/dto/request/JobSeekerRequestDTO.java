package com.example.myrh.model.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class  JobSeekerRequestDTO {
    @NotBlank(message = "Login is required")
    private String fullName;
    @NotBlank(message = "Password is required")
    private String password;
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    private String phone;
    @NotBlank(message = "jobProfile is required")
    private String jobProfile;
    @NotBlank(message = "city is required")
    private String city;
    @NotBlank(message = "education level is required")
    private String educationLevel;
}