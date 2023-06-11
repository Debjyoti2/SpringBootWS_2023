package com.pwb.demo.service;

import org.springframework.stereotype.Service;

import com.pwb.demo.vo.User;

@Service
public class FemaleGenderServiceImpl implements GenderService{

	@Override
	public User saveUser(User user) {
		System.out.println("FeMale Gender Service Called");
		return new User();
	}
	
}
