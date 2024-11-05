package com.example.Job_app.service;

import com.example.Job_app.entity.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    public Boolean addReview(Long companyId ,Review review);

    public Review getReview(Long companyId, Long reviewId);

    public Boolean updateReview(Long companyId, Long reviewId ,Review updatedReview);

}
