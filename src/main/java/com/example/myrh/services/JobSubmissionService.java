package com.example.myrh.services;

import com.example.myrh.model.entity.JobSubmission;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface JobSubmissionService {
    public JobSubmission addJobSubmission(Long jobSubmission, String pdfFilePath);
    public List<JobSubmission> getSubmissionsForJobOffer(Long jobOffreid);
    }
