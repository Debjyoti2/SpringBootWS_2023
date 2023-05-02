package com.pwb.demo.service;

import java.util.List;

import com.pwb.demo.vo.Employee;

public interface EmployeeService {
	
	public List<Employee> getemp();
	public Employee saveEmp(Employee emp);
	public List<Employee> savemultiuser(List<Employee> empList);
	public List<Employee> findByName(String name);
	public List<Employee> getempfiltername(String name);

}
