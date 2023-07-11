package com.hibernateOnetoOne.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "th_student")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "studentId")
public class Student {
	
	@Id
	@GeneratedValue
	private Long studentId;
	private String studentName;
	
	//one to one mapping (bi-directional)
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "student")
	private Passport passport;
	

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}
	
	
	
}
