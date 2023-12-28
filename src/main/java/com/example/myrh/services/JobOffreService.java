package com.example.myrh.services;

import com.example.myrh.model.dto.request.JobOfferRequestDTO;
import com.example.myrh.model.dto.response.JobOfferResponseDTO;
import com.example.myrh.model.entity.JobOffer;

public interface JobOffreService {
    JobOfferResponseDTO addOffer(JobOfferRequestDTO jobOfferRequest);
    void updateApprovalStatus(Long offerId, boolean approved);

}
