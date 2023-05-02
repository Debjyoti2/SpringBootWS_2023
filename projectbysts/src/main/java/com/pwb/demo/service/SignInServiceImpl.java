package com.pwb.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwb.demo.dao.SignInRepository;
import com.pwb.demo.vo.SignInEmployee;

@Service
public class SignInServiceImpl implements SignInService{
	
	@Autowired
	private SignInRepository dao;
	
	@Override
	public SignInEmployee doSignin(String userName,String userEmail) {
		SignInEmployee e = new SignInEmployee(100,userName,userEmail);
		SignInEmployee e1=  dao.save(e);
		return e1;
	}

}
