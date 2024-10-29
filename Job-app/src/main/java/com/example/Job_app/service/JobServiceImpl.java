package com.example.Job_app.service;

import com.example.Job_app.entity.Job;
import com.example.Job_app.repository.JobRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {
//    private List<Job> jobs = new ArrayList<>();
    private JobRespository jobRespository;

    public JobServiceImpl(JobRespository jobRespository) {
        this.jobRespository = jobRespository;
    }

    private Long nextId =1L;
    @Override
    public List<Job> findAll() {
        return jobRespository.findAll();
//        return new ArrayList<>(jobs);
    }


    @Override
    public String createJob(@RequestBody Job job) {
//        job.setId(nextId++);
       jobRespository.save(job);
       return "job created successfully";
    }

    @Override
    public Job getJobById(Long id) {
        return  jobRespository.findById(id).orElse(null);
    }

    @Override
    public Boolean deleteJobById(Long id) {
        try {
            jobRespository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Boolean updateJob(Long id, Job updatedJob) {
        Optional<Job>jobOptional=jobRespository.findById(id);

            if(jobOptional.isPresent()){
                Job job=jobOptional.get();
                job.setTitle(updatedJob.getTitle());
                job.setDesc(updatedJob.getDesc());
                job.setLocation(updatedJob.getLocation());
                job.setMaxSalary(updatedJob.getMaxSalary());
                job.setMinSalary(updatedJob.getMinSalary());
                jobRespository.save(job);
                return true;
            }

        return false;
    }



}
