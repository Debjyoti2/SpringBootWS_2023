package com.tcs.pwb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.pwb.dao.UserRepository;
import com.tcs.pwb.vo.User;

@Service
public class UserDetailServiceImpl implements UserDetailService{
	
	@Autowired
	private UserRepository userRepository;
	
	public User getsingleUser(String userName) {
		return this.userRepository.findByUsername(userName); 
	}
	
	public List<User> getAllUsers(){
		return (List<User>) this.userRepository.findAll();
	}

}
