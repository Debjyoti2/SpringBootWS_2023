package com.manytomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.entity.StudentM;
import com.manytomany.service.StudentMService;

@RestController
@RequestMapping("/studentm")
public class StudentMController {
	
	@Autowired
	private StudentMService service;
	
	@PostMapping("/savestudent")
	public StudentM saveStudent(@RequestBody StudentM student) {
		return service.saveStudent(student);
	}

}
