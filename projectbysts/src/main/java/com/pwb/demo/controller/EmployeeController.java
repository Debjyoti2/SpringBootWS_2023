package com.pwb.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwb.demo.exception.NoAccessToEmpFetchException;
import com.pwb.demo.service.EmployeeService;
import com.pwb.demo.vo.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	private static final Logger logger = LogManager.getLogger(EmployeeController.class);
	
	@RequestMapping(value="/home",method =RequestMethod.GET)
	public String unsecuredHomeMethod() {
		
		String string =null;
		char string2 = string.charAt(2);
		return " get home method";
	}

	@RequestMapping("/getemp")
	public ResponseEntity<List<Employee>> getemp(){
		logger.debug("Debugging log getemp");
		logger.info("Info log getemp");
		logger.warn("Hey, This is a warning! getemp");
		logger.error("Oops! We have an Error. OK getemp");
		logger.fatal("Damn! Fatal error. Please fix me. getemp");
		
		int id=5;
		
		if(id==1) {
			throw new NullPointerException();
		}
		if(id==2) {
			throw new NoAccessToEmpFetchException();
		}
	      
		List<Employee> empList =  service.getemp();
		if(empList.size()<1) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(empList);
	}
	
	@RequestMapping("/getallemp")
	public ResponseEntity<List<Employee>> getallemp(){
	      
		List<Employee> empList =  service.getemp();
		if(empList.size()<1) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(empList);
	}
	
	@RequestMapping(value ="/saveemp",method = RequestMethod.POST)
	public String saveEmp(@RequestBody Employee emp ) {
		emp.setPassword(this.bCryptPasswordEncoder.encode(emp.getPassword()));
		Employee empsaved = service.saveEmp(emp);
		return "Emp Name  : " + empsaved.getName() + "  saved successfully";
	}
	
	@RequestMapping(value="/savemultiuser",method = RequestMethod.POST)
	public List<Employee> savemultiuser(@RequestBody List<Employee> empList){
		List<Employee> empList2 = new ArrayList<>();
		empList2 = service.savemultiuser(empList);
		return empList2;
	}
	
	@RequestMapping("/findbyname")
	public List<Employee> findByAt_emp_name(@RequestParam(name = "name",required = true) String name){
		List<Employee> empList = new ArrayList<>();
		empList = service.findByName(name);
		return empList;
		
	}
	
	//using Spring Data JPA native query
	@RequestMapping("/getempfiltername")
	public List<Employee> getempfiltername(@RequestParam("name") String name){
		List<Employee> empList =  service.getempfiltername(name);
		return empList;
	}
	
	
}
