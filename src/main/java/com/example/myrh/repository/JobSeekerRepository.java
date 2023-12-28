package com.example.myrh.repository;

import com.example.myrh.model.entity.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository  extends JpaRepository<JobSeeker, Long> {
}
