package com.hibernateOnetoOne.service;

import com.hibernateOnetoOne.entity.Student;

public interface StudentService {
	
	Student registerStudent(Student student);
	Student getStudentById(Long studentId);

}
