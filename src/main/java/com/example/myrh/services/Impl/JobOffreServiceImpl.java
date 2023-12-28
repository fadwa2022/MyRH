package com.example.myrh.services.Impl;

import com.example.myrh.model.dto.request.JobOfferRequestDTO;
import com.example.myrh.model.dto.response.JobOfferResponseDTO;
import com.example.myrh.model.entity.JobOffer;
import com.example.myrh.repository.JobOfferRepository;
import com.example.myrh.services.JobOffreService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class JobOffreServiceImpl implements JobOffreService {
    @Autowired
    private JobOfferRepository jobOfferRepository;
    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public JobOfferResponseDTO addOffer(JobOfferRequestDTO jobOfferRequest) {
        JobOffer jobOffer = jobOfferRequest.toModel();

        JobOffer savedJobOffer = jobOfferRepository.save(jobOffer);

        JobOfferResponseDTO responseDTO = modelMapper.map(savedJobOffer, JobOfferResponseDTO.class);

        return responseDTO;
    }

    @Override
    public void updateApprovalStatus(Long offerId, boolean approved) {
        JobOffer jobOffer = jobOfferRepository.findById(offerId)
                .orElseThrow(() -> new RuntimeException("Offre d'emploi introuvable"));

        jobOffer.setApproved(approved);

        jobOfferRepository.save(jobOffer);
    }
}
