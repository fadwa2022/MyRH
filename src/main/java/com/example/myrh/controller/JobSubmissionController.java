package com.example.myrh.controller;


import com.example.myrh.model.entity.JobSubmission;
import com.example.myrh.services.JobSubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/job-submissions")
public class JobSubmissionController {

    private final JobSubmissionService jobSubmissionService;

    @Autowired
    public JobSubmissionController(JobSubmissionService jobSubmissionService) {
        this.jobSubmissionService = jobSubmissionService;
    }

    @PostMapping
    public ResponseEntity<JobSubmission> addJobSubmission(
            @RequestParam("pdfFile") String pdfFilelien,
            @RequestParam("jobSubmission") Long jobSubmission
      ) {

            JobSubmission savedJobSubmission = jobSubmissionService.addJobSubmission(jobSubmission, pdfFilelien);

            return new ResponseEntity<>(savedJobSubmission, HttpStatus.CREATED);

    }
    @GetMapping("/{jobOffreid}/submissions")
    public ResponseEntity<List<JobSubmission>> getSubmissionsForJobOffer(@PathVariable Long jobOffreid) {
        List<JobSubmission> submissions = jobSubmissionService.getSubmissionsForJobOffer(jobOffreid);
        return new ResponseEntity<>(submissions, HttpStatus.OK);
    }
}