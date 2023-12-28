package com.example.myrh.services;

import com.example.myrh.model.entity.JobSubmission;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public interface JobSubmissionService {
    public JobSubmission addJobSubmission(Long jobSubmission, MultipartFile pdfFilePath) throws IOException;

    }
