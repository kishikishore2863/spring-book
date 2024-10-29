package com.example.Job_app.service;

import com.example.Job_app.entity.Company;

import java.util.List;

public interface CompanyService {
    public List<Company> findAll();

    public Boolean updatedCompany(Company newCompany,Long id);

    public String createCompany(Company company);

    public boolean deleteCompany(Long id);

    public Company getCompanyById(Long id);
}
