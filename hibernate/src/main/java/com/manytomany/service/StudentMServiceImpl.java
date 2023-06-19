package com.manytomany.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytomany.dao.CourseMRepo;
import com.manytomany.dao.StudentMRepo;
import com.manytomany.entity.CourseM;
import com.manytomany.entity.StudentM;

@Service
public class StudentMServiceImpl implements StudentMService{
	
	@Autowired
	private StudentMRepo dao;
	
	@Autowired
	private CourseMRepo courseRepo;
	
	@Override
	@Transactional
	public StudentM saveStudent(StudentM student) {
		 CourseM course = new CourseM();
		 course.setCourseName("Java 1.8");
		 
		 dao.save(student);
		 courseRepo.save(course);
		 
		 student.addCourse(course);
		 course.addStudent(student);
		 
		 
		 return student;
		 
	}
	

}
