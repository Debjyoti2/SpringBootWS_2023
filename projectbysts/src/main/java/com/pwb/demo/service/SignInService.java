package com.pwb.demo.service;

import com.pwb.demo.vo.SignInEmployee;

public interface SignInService {
	
	public SignInEmployee doSignin(String userName,String userEmail);

}
