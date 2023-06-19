package com.hibernateOnetoOne.entity;

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
@Table(name = "t_passport")
public class Passport {
	
	@Id
	@GeneratedValue
	private Long passportId;
	private String passportName;
	
	//one to one mapping (bi-directional)
	
//	@OneToOne(fetch = FetchType.EAGER,mappedBy = "passport")
//	private Student student;

	public Passport(String passportName) {
		super();
		this.passportName = passportName;
	}
	
	
	

}
