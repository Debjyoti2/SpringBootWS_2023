package com.manytomany.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property ="courseId" )
public class CourseM {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	private String courseName;
	
	@ManyToMany(mappedBy = "courses",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	//@JsonBackReference
	private List<StudentM> students = new ArrayList<>();
	
	public void addStudent(StudentM student) {
		students.add(student);
	}
	

}
