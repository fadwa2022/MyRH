package com.example.myrh.repository;

import com.example.myrh.model.entity.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobOfferRepository  extends JpaRepository<JobOffer, Long> {
}
