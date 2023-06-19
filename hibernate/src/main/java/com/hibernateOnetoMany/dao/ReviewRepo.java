package com.hibernateOnetoMany.dao;

import org.springframework.data.repository.CrudRepository;

import com.hibernateOnetoMany.entity.Review;

public interface ReviewRepo extends CrudRepository<Review,Long>{

}
