package com.manytomany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "m_course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseM {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	private String courseName;
	
	@ManyToMany(mappedBy = "courses")
	private List<StudentM> students = new ArrayList<>();
	
	public void addStudent(StudentM student) {
		students.add(student);
	}
	

}
