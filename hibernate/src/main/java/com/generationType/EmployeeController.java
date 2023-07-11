package com.generationType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@PostMapping("/saveEmployee_AUTO")
	public Employee_AUTO saveEmployee_AUTO(@RequestBody Employee_AUTO emp) {
		return service.savEmployee_AUTO(emp);
	}
	
	@PostMapping("/saveEmployee_IDENTITY")
	public Employee_IDENTITY saveEmployee_IDENTITY(@RequestBody Employee_IDENTITY emp) {
		return service.savEmployee_IDENTITY(emp);
	}
	
}
