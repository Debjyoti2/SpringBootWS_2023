package com.hibernateOnetoOne.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_student")
public class Student {
	
	@Id
	@GeneratedValue
	private Long studentId;
	private String studentName;
	
	//one to one mapping (bi-directional)
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Passport passport;
}
