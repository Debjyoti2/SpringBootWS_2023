package com.hibernateOnetoOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernateOnetoOne.entity.Student;
import com.hibernateOnetoOne.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	@PostMapping("/register")
	public Student registerStudent(@RequestBody Student student) {
		return service.registerStudent(student);
	}
	
	@GetMapping("/getStudentById/{studentId}")
	public Student getStudentById(@PathVariable("studentId")  Long studentId) {
		return service.getStudentById(studentId);
		
	}
	

}
