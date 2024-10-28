package com.example.Job_app.service;

import com.example.Job_app.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Iterator;
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

    @Override
    public Boolean deleteJobById(Long id) {
        Iterator<Job>iterator=jobs.iterator();
        while(iterator.hasNext()){
            Job job =iterator.next();
            if(job.getId().equals(id)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean updateJob(Long id, Job updatedJob) {
        for(Job job:jobs){
            if(job.getId().equals(id)){
                job.setTitle(updatedJob.getTitle());
                job.setDesc(updatedJob.getDesc());
                job.setLocation(updatedJob.getLocation());
                job.setMaxSalary(updatedJob.getMaxSalary());
                job.setMinSalary(updatedJob.getMinSalary());
                return true;
            }
        }
        return false;
    }


}
