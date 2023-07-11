package com.hibernateOnetoOne.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernateOnetoOne.dao.PassportRepo;
import com.hibernateOnetoOne.dao.StudentRepo;
import com.hibernateOnetoOne.entity.Passport;
import com.hibernateOnetoOne.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentdao;
	
	
	@Override
	@Transactional
	public Student registerStudent(Student student) {
	    studentdao.save(student);
	    return student;
	}
	
	
	@Override
	@Transactional
	public Student getStudentById(Long studentId) {
		Optional<Student> studentOptional =  studentdao.findById(studentId);
		Student student = studentOptional.get();
		return student;
	}
}
