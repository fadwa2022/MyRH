package com.example.myrh.services.Impl;

import com.example.myrh.exception.CompanyAlreadyExistsException;
import com.example.myrh.model.entity.JobOffer;
import com.example.myrh.model.entity.JobSubmission;
import com.example.myrh.repository.JobOfferRepository;
import com.example.myrh.repository.JobSubmissionRepository;
import com.example.myrh.services.JobSubmissionService;
import jakarta.enterprise.inject.New;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

@Service
public class JobSubmissionServiceImpl implements JobSubmissionService {

    private final JobSubmissionRepository jobSubmissionRepository;
    private final JobOfferRepository jobOfferRepository;
    @Autowired
    public JobSubmissionServiceImpl(JobSubmissionRepository jobSubmissionRepository, JobOfferRepository jobOfferRepository) {
        this.jobSubmissionRepository = jobSubmissionRepository;
        this.jobOfferRepository= jobOfferRepository;
    }

@Override
    public JobSubmission addJobSubmission(Long jobOffreid, String pdfFile) throws IOException {
         JobOffer jobOffer = jobOfferRepository.getReferenceById(jobOffreid);
//todo:complet this methode je veut ajouter unesubmition et plus aficher lasubmission et apres passer au frontend 
}

}
