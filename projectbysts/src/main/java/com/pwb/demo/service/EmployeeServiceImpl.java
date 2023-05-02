package com.pwb.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pwb.demo.dao.EmployeeRepo;
import com.pwb.demo.vo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo dao;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	//fetch all
	@Override
	public List<Employee> getemp() {
		List<Employee> empList = new ArrayList<>();
		empList=(List<Employee>) dao.findAll();
		return empList;
	}
	
	
	//save one object
	@Override
	public Employee saveEmp(Employee emp) {
		Employee empsaved = dao.save(emp);
		return empsaved;
	}
	
	
	//save multi object List<Object>
	@Override
	public List<Employee> savemultiuser(List<Employee> empList) {
		List<Employee> empList2 = new ArrayList<>();
		empList2 = (List<Employee>) dao.saveAll(empList);
		return empList2;
	}
	
	//for update save diye ei update hbe..id same thkle update kore dbe db te..bcs empid te @ID lagano ache Employee class e.
	
	
	//calling custom methods
	
	@Override
	public List<Employee> findByName(String name) {
		List<Employee> empList2 = new ArrayList<>();
		empList2 = (List<Employee>) dao.findByName(name);
		return empList2;
	}
	
	
	
	//calling custom methods using native query
	
		@Override
		public List<Employee> getempfiltername(String name) {
			List<Employee> empList2 = new ArrayList<>();
			empList2 = (List<Employee>) dao.getempfiltername(name);
			return empList2;
		}
	
}
