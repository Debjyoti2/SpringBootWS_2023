package com.hibernateOnetoMany.dao;

import org.springframework.data.repository.CrudRepository;

import com.hibernateOnetoMany.entity.Course;

public interface CourseRepo extends CrudRepository<Course,Long>{

}
