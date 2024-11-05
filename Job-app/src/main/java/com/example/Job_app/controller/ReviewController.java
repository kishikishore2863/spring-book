package com.example.Job_app.controller;

import com.example.Job_app.entity.Review;
import com.example.Job_app.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {

    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long companyId){
        return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);

    }

    @PostMapping("/reviews")
    public ResponseEntity<String> addReview(@PathVariable Long companyId, @RequestBody Review review){

    Boolean isReviwedSaved = reviewService.addReview(companyId,review);
    if(isReviwedSaved){
        return new ResponseEntity<>("Review Added Successfully",HttpStatus.OK);
    }

        return new ResponseEntity<>("Review Failed",HttpStatus.OK);

    }

    @GetMapping("/reviews/{reviewId}")
    public ResponseEntity<Review>getReview(@PathVariable Long companyId,
                                           @PathVariable Long reviewId){
    return new  ResponseEntity<>( reviewService.getReview(companyId,reviewId),HttpStatus.OK);
    }

    @PutMapping("/reviews/{reviewId}")
    public ResponseEntity<String>updateReview(@PathVariable Long companyId,
                                              @PathVariable Long reviewId,
                                               @RequestBody Review review){
       boolean isreviewUpdated =reviewService.updateReview(companyId,reviewId,review);
       if(isreviewUpdated) {
           return new ResponseEntity<>("Review updated successfully", HttpStatus.OK);
       }
        return new ResponseEntity<>("Review update failed",HttpStatus.OK);
    }

}
