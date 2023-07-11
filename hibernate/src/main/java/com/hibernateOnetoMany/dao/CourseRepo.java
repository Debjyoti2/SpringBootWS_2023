package com.hibernateOnetoMany.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hibernateOnetoMany.entity.Course;
import java.util.List;
import java.time.LocalDateTime;



public interface CourseRepo extends CrudRepository<Course,Long>{
	
	public List<Course> findByCourseName(String courseName);
	public List<Course> findByCreatedOn(LocalDateTime createdOn);
	public List<Course> findByCourseNameAndCreatedOn(String name, LocalDateTime createdOn);
	public List<Course> findByCourseNameLike(String courseName);
	public List<Course> findByCourseIdGreaterThan(Long courseId);
	public List<Course> findByCourseNameContains(String courseName);
	
	//And
	//Like
	//GreaterThan
	//LessThan
	//Contains
	//Between
	
	//how to call procedure
	@Query(value = "CALL SP_GET_ALL_COURSE",nativeQuery = true)
	public List<Course> findByAllCourse();
	
	@Query(value = "CALL SP_GET_ALL_COURSE(:in_course_id)",nativeQuery = true)
	public Course findByOneCourseID(Long in_course_id);

}
