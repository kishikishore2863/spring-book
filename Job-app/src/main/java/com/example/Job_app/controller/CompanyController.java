package com.example.Job_app.controller;

import com.example.Job_app.entity.Company;
import com.example.Job_app.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/companies")
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<List<Company>>getAllCompanies(){
        return new ResponseEntity<List<Company>>(companyService.findAll(),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompany(@PathVariable Long id , @RequestBody Company company){
        companyService.updatedCompany(company,id);
        return new ResponseEntity<>("company updated",HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String>createCompany(@RequestBody Company company){
        return new ResponseEntity<String>(companyService.createCompany(company),HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String>deleteCompany(@PathVariable Long id){
        Boolean res =companyService.deleteCompany(id);
        if(res){
           return new ResponseEntity<String>("Company deleted Successfully",HttpStatus.OK);
        }
        return new ResponseEntity<String>("Company deleted Failed",HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Company> getComapany(@PathVariable Long id){
        Company company =companyService.getCompanyById(id);
        if(company != null){
            return new ResponseEntity<Company>(company,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND );
    }



}
