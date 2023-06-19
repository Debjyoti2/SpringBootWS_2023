package com.hibernateOnetoMany.service;

import com.hibernateOnetoMany.entity.Course;

public interface CourseService {
	
	Course saveCourse( Course course);
	Course getCouseById(Long courseId);

}
