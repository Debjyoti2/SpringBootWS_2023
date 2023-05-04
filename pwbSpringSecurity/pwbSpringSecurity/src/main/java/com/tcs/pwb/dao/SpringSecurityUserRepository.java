package com.tcs.pwb.dao;

import org.springframework.data.repository.CrudRepository;

import com.tcs.pwb.vo.User;

public interface SpringSecurityUserRepository extends CrudRepository<User, String>{
	
	
	User findByUsername(String username);

}
