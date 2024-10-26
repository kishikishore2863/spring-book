package com.example.Job_app.service;

import com.example.Job_app.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private List<Job> jobs = new ArrayList<>();
    private Long nextId =1L;
    @Override
    public List<Job> findAll() {
        return new ArrayList<>(jobs);
    }


    @Override
    public String createJob(@RequestBody Job job) {
        job.setId(nextId++);
       jobs.add(job);
       return "job created successfully";
    }

    @Override
    public Job getJobById(Long id) {
        for(Job job:jobs){
            if(job.getId().equals(id)){
                return job;
            }
        }
        return null;
    }


}
