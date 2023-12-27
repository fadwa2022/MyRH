package com.example.myrh.repository;

import com.example.myrh.model.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<Company, String> {
    Company findCompanyByEmail(String Email);
}
