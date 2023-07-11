package com.manytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.entity.CourseM;
import com.manytomany.service.CourseMService;

@RestController
@RequestMapping("/coursem")
public class CourseMController {
	
	@Autowired
	private CourseMService service;
	
	@PostMapping("/savecourse")
	public CourseM saveCourse(@RequestBody CourseM course) {
		return service.saveCourse(course);
	}
	
	@GetMapping("/getallcourse")
	public List<CourseM> getallCourse(){
		return service.getallCourse();
	}

}
