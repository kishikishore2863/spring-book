package com.example.Job_app.service;

import com.example.Job_app.entity.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);
}
