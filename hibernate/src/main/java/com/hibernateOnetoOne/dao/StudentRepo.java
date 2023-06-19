package com.hibernateOnetoOne.dao;

import org.springframework.data.repository.CrudRepository;

import com.hibernateOnetoOne.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Long>{
	
	

}
