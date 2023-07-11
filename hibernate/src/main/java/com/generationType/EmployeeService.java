package com.generationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeAUTORepository repository;
	
	@Autowired
	private EmployeeIDENTITYRepository identityRepository;
	
	public Employee_AUTO savEmployee_AUTO(Employee_AUTO emp) {
		return repository.save(emp);
	}
	
	public Employee_IDENTITY savEmployee_IDENTITY(Employee_IDENTITY emp) {
		return identityRepository.save(emp);
	}
	
}
