package com.hibernateOnetoMany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernateOnetoMany.entity.Review;
import com.hibernateOnetoMany.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	private ReviewService service;
	
	@GetMapping("/getReview/{reviewId}")
	public Review getReviewById(@PathVariable("reviewId") Long reviewId) {
		return service.getReviewById(reviewId);
	} 
	
	
}
