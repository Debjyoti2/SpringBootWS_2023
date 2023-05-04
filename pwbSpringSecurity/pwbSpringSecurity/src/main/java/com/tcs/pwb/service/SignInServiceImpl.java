package com.tcs.pwb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.pwb.dao.UserRepository;
import com.tcs.pwb.vo.User;

@Service
public class SignInServiceImpl implements SignInService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User signin(User user) {
		return userRepository.save(user);
	}
	
}
