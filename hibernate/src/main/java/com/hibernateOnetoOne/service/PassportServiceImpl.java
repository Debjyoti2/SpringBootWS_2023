package com.hibernateOnetoOne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernateOnetoOne.dao.PassportRepo;
import com.hibernateOnetoOne.entity.Passport;
import com.hibernateOnetoOne.entity.Student;

@Service
public class PassportServiceImpl implements PassportService{
	
	@Autowired
	private PassportRepo dao;
	
	@Autowired
	private StudentService studentService;
	
	@Override
	@Transactional
	public Passport savePassport(Passport passport) {
		
		Student student = new Student("Kittu");
		
		student.setPassport(passport);
		passport.setStudent(student);
		
		dao.save(passport);
		
		return passport;
	}
	
	@Override
	public Passport getPassportById(Long passportId) {
		Passport passport  = dao.findById(passportId).orElse(new Passport());
		System.out.println(passport.getStudent().getStudentName());;
		return passport;
	}

}
