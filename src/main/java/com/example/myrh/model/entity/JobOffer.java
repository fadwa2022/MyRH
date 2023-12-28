package com.example.myrh.model.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table
public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long offerId;
    private String title;
    private String description;
    private String jobProfile;
    private String city;
    private String educationLevel;
    private String salary;
    private boolean approved;

    @ManyToOne
    @JoinColumn(name = "companyoffred_id")
    private Company companyOffred;


}