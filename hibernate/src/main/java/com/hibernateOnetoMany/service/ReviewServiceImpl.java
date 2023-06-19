package com.hibernateOnetoMany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernateOnetoMany.dao.ReviewRepo;
import com.hibernateOnetoMany.entity.Review;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	@Autowired
	private ReviewRepo dao;
	
	@Override
	public Review getReviewById(Long reviewId) {
		return dao.findById(reviewId).orElse(new Review());
	}

}
