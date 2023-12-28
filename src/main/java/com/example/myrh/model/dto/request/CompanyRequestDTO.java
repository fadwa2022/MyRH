package com.example.myrh.model.dto.request;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CompanyRequestDTO {
    @NotBlank(message = "address is required")
    private String address;
    @NotBlank(message = "email is required")
    @Email(message = "Invalid email format")
    private String email;
    @NotBlank(message = "phone is required")
    private String phone;
    @NotBlank(message = "image is required")
    private String image;


}