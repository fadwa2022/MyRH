package com.example.myrh.controller;

import com.example.myrh.model.dto.request.JobOfferRequestDTO;
import com.example.myrh.model.dto.response.JobOfferResponseDTO;
import com.example.myrh.services.JobOffreService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/job-offers")
public class JobOfferController {
    private final JobOffreService jobOffreService;

    @PostMapping
    public ResponseEntity<JobOfferResponseDTO> addJobOffer(@RequestBody JobOfferRequestDTO jobOfferRequest) {
        JobOfferResponseDTO responseDTO = jobOffreService.addOffer(jobOfferRequest);
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
    @PutMapping("/{offerId}/update-approval")
    public ResponseEntity<String> updateApprovalStatus(@PathVariable Long offerId, @RequestParam boolean approved) {
        jobOffreService.updateApprovalStatus(offerId, approved);
        return ResponseEntity.ok("Statut d'approbation mis à jour avec succès");
    }
}
