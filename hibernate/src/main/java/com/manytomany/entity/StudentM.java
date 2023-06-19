package com.manytomany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "m_student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentM {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	private String studentName;
	
	@ManyToMany
	@JoinTable(name = "t_student_course_map")
	private List<CourseM> courses = new ArrayList<>();
	
	public void addCourse(CourseM course) {
		courses.add(course);
	}

}
