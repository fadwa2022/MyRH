package com.example.myrh.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table

public class JobSubmission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private JobOffer jobOffer;
    @Lob
    @Column(name = "pdf_document", columnDefinition = "bytea")
    private byte[] pdfDocumentcv;
}
