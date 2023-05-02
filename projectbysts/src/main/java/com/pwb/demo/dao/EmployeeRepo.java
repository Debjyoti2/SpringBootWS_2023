package com.pwb.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.pwb.demo.vo.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
	
	//custom methods with [method name matching]
	public List<Employee> findByName(String name);
	
	
	//custom methods using native query
	@Query(value = "select * from Employee s where s.name=:name",nativeQuery = true)
	public List<Employee> getempfiltername(@Param("name") String name);
	

	
	// other repository are 
	// JpaRepository, PagingAndSortingRepository
}
