package com.example.Job_app.repository;

import com.example.Job_app.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRespository extends JpaRepository<Job,Long> {
    
}