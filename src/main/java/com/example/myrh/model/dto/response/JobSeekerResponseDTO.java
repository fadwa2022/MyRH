package com.example.myrh.model.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JobSeekerResponseDTO  {
    private String id;
    private String login;
    private String email;
    private String phone;
    private String jobProfile;
    private String city;
    private String educationLevel;
}