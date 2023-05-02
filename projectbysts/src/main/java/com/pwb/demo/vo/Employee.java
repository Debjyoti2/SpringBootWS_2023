package com.pwb.demo.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_employee")
public class Employee {
	@Id
	@Column(name = "at_emp_id")
	private Integer empid;
	
	@Column(name = "at_name")
	private String name;
	
	@Column(name="at_phone_no") 
	private String phoneno;
	
	@Column(name = "at_age")
	private Integer age;
	
	@Column(name="at_password")
	private String password;
	
	@Column(name = "at_role")
	private String role;
	
	public Employee() {
		super();
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Employee(Integer empid, String name, String phoneno, Integer age, String password, String role) {
		super();
		this.empid = empid;
		this.name = name;
		this.phoneno = phoneno;
		this.age = age;
		this.password = password;
		this.role = role;
	}

	
	
	

	
	
	
	
	

}
