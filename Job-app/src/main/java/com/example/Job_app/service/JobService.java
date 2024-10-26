package com.example.Job_app.service;

import com.example.Job_app.entity.Job;

import java.util.List;


public interface JobService {

    public List<Job> findAll();
    public String createJob(Job job);
    public  Job getJobById(Long id);
}
