package com.example.Job_app.controller;

import com.example.Job_app.entity.Job;
import com.example.Job_app.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class JobController {

  private JobService jobService;

  public JobController(JobService jobService){
      this.jobService=jobService;
  }



    @GetMapping("/jobs")
    public List<Job> findAll(){

        return jobService.findAll();
    }

    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){

        return jobService.createJob(job);
    }

    @GetMapping("/jobs/{id}")
    public Job getJob(@PathVariable Long id ){
      return jobService.getJobById(id);
    }


}
