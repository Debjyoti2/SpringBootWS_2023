package com.hibernateOnetoMany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernateOnetoMany.entity.Course;
import com.hibernateOnetoMany.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@PostMapping("/savecourse")
	public Course saveCourse(@RequestBody Course course) {
		return service.saveCourse(course);
	}
	
	@GetMapping("/getcourse/{courseId}")
	public Course getCouseById(@PathVariable("courseId") Long courseId) {
		return service.getCouseById(courseId);
	}

}
