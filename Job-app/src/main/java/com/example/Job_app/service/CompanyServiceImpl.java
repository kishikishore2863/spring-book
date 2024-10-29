package com.example.Job_app.service;

import com.example.Job_app.entity.Company;
import com.example.Job_app.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService{

 private CompanyRepository companyRepository;

 public CompanyServiceImpl(CompanyRepository companyRepository) {
  this.companyRepository = companyRepository;
 }

 @Override
 public List<Company> findAll() {
  return companyRepository.findAll();
 }

 @Override
 public Boolean updatedCompany(Company newCompany ,Long id) {
  Optional<Company> companyOptional =companyRepository .findById(id);
  if(companyOptional.isPresent() ){
   Company company =companyOptional.get();
   company.setDescription(newCompany.getDescription());
   company.setName(newCompany.getName());
   company.setJobs(company.getJobs());
   companyRepository.save(company);
   return true;
  }
  return false;
 }

 @Override
 public String createCompany(Company company) {
  companyRepository.save(company);
  return "created company";
 }

 @Override
 public boolean deleteCompany(Long id) {
  if(companyRepository.existsById(id)){
   companyRepository.deleteById(id);
   return true;
  }
  return false;
 }

 @Override
 public Company getCompanyById(Long id) {
  return companyRepository.findById(id).orElse(null);
 }


}
