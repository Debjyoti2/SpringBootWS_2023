package com.manytomany.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytomany.dao.CourseMRepo;
import com.manytomany.dao.StudentMRepo;
import com.manytomany.entity.CourseM;
import com.manytomany.entity.StudentM;

@Service
public class CourseMServiceImpl implements CourseMService{
	
	@Autowired
	private CourseMRepo dao;
	
	@Autowired
	private StudentMRepo studentMRepo;
	
	@Override
	@Transactional
	public CourseM saveCourse(CourseM course) {
		
		StudentM student = new StudentM();
		student.setStudentName("Kittu");
		
		dao.save(course);
		studentMRepo.save(student);
		
		course.addStudent(student);
		student.addCourse(course);
		
		return course;
		
	}

}
