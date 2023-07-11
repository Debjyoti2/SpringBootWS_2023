package com.hibernateOnetoMany.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernateOnetoMany.dao.CourseRepo;
import com.hibernateOnetoMany.entity.Course;
import com.hibernateOnetoMany.entity.Review;



@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepo dao;
	
	@Autowired
	private EntityManager em;
	
	 private static final Logger LOG = LogManager.getLogger(CourseServiceImpl.class);
	
	@Override
	@Transactional
	public Course saveCourse(Course course) {
		
		
		Review r1= new Review("Good",4);
		Review r2= new Review("Bad",2);
		Review r3= new Review("Best",5);

		//review is owning side of relationship.. so add course in review.. so that in review table courseid can be stored.
		r1.setCourse(course);
		r2.setCourse(course);
		r3.setCourse(course);
		
		List<Review> reviewsList = new ArrayList<>();
		reviewsList.add(r1);
		reviewsList.add(r2);
		reviewsList.add(r3);
		
		course.setReviews(reviewsList);
		
		dao.save(course);
		
		
		return course;
	}
	
	
	//1st level of cache testing 
	@Override
	@Transactional
	public Course getCouseById(Long courseId) {
	
		Course courseRet = dao.findById(courseId).orElse(new Course());
		System.out.println(courseRet.getCourseName());
		
		dao.findById(courseId).orElse(new Course());
		
		Session session= em.unwrap(Session.class);
		session.evict(courseRet);
		
		dao.findById(courseId).orElse(new Course());
		
		
		//find if any record exists or not.
		//boolean existsFlag = dao.existsById(courseId);
		
		//count of rows in the table
		//long totalrowcount = dao.count();
		
		
		return courseRet;
	}

}
