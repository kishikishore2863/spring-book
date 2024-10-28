package com.example.Job_app.controller;

import com.example.Job_app.entity.Job;
import com.example.Job_app.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class JobController {

  private JobService jobService;

  public JobController(JobService jobService){
      this.jobService=jobService;
  }



    @GetMapping("/jobs")
    public ResponseEntity<List<Job>>findAll(){
       return ResponseEntity.ok(jobService.findAll());
    }

//    @PostMapping("/jobs")
  @RequestMapping(value = "/jobs" ,method = RequestMethod.POST)
    public ResponseEntity<String> createJob(@RequestBody Job job){
         String res =jobService.createJob(job);
        return new ResponseEntity<String>(res, HttpStatus.OK);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJob(@PathVariable Long id ){
      Job res = jobService.getJobById(id);
      if(res != null)
         return new ResponseEntity<Job>(res,HttpStatus.OK);
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @DeleteMapping("jobs/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id ){
    boolean deleted =jobService.deleteJobById(id);
    if(deleted)
      return new ResponseEntity<>("job deleted successfully",HttpStatus.OK);
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }


  @PutMapping("/jobs/{id}")
  public ResponseEntity<String> updateJob(@PathVariable Long id, @RequestBody Job updatedJob){
    boolean updated =jobService.updateJob(id,updatedJob);
    if(updated)
      return new ResponseEntity<String>("job updated successfully", HttpStatus.OK);
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }




}
