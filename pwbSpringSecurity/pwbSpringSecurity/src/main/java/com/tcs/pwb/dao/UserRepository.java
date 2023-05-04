package com.tcs.pwb.dao;

import org.springframework.data.repository.CrudRepository;

import com.tcs.pwb.vo.User;

public interface UserRepository extends CrudRepository<User, String>{
	
	
	public User findByUsername(String name);

}
