package com.example.myrh.controller;


import com.example.myrh.model.entity.JobSubmission;
import com.example.myrh.services.JobSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/job-submissions")
public class JobSubmissionController {

    private final JobSubmissionService jobSubmissionService;

    @Autowired
    public JobSubmissionController(JobSubmissionService jobSubmissionService) {
        this.jobSubmissionService = jobSubmissionService;
    }

    @PostMapping
    public ResponseEntity<JobSubmission> addJobSubmission(
            @RequestParam("pdfFile") MultipartFile pdfFile,
            @RequestParam("jobSubmission") Long jobSubmission
      ) {
       try {
            JobSubmission savedJobSubmission = jobSubmissionService.addJobSubmission(jobSubmission, pdfFile);

            return new ResponseEntity<>(savedJobSubmission, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}