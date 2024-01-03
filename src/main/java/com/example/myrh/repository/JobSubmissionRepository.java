package com.example.myrh.repository;

import com.example.myrh.model.entity.JobOffer;
import com.example.myrh.model.entity.JobSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JobSubmissionRepository extends JpaRepository<JobSubmission, Long> {
    Optional<JobSubmission> findJobSubmissionBypdfDocumentcv(String pdfDocumentcv);

    List<JobSubmission> findByJobOffer(JobOffer jobOffer);
}
