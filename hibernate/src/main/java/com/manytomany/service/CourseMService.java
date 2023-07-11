package com.manytomany.service;

import java.util.List;

import com.manytomany.entity.CourseM;

public interface CourseMService {
	
	CourseM saveCourse(CourseM course);
	List<CourseM> getallCourse();

}
