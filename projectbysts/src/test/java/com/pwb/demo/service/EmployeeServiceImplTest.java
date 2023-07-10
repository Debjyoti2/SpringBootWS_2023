package com.pwb.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.pwb.demo.dao.EmployeeRepo;
import com.pwb.demo.vo.Employee;

@SpringBootTest
class EmployeeServiceImplTest {

	@Autowired
	private EmployeeService employeeService;
	
	@MockBean
	private EmployeeRepo repo;
	
	
	@BeforeEach
	public void setup() {
		List<Employee> employeesMock = List.of(new Employee(1,"Madhu","2323232323",23,"sedsdsdqdw","TM"),
				new Employee(2,"Kittu2","2323232323",23,"sedsdsdqdw","TM"));
		Mockito.when(repo.findAll()).thenReturn(employeesMock);
	}
	
	@Test
	public void testgetemp() {
		List<Employee> employees =  employeeService.getemp();
		assertEquals("Madhu",employees.get(0).getName());
		
	}


}
