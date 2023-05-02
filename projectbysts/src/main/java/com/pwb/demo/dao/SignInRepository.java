package com.pwb.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.pwb.demo.vo.SignInEmployee;

public interface SignInRepository extends CrudRepository<SignInEmployee,Integer>{
	
	
}
