package com.jwt.service;

import java.util.ArrayList;

import com.jwt.entities.JWTUser;

public interface UserService {
	
	public JWTUser saveUser(JWTUser user);
	public JWTUser getSingleUser(String userName);
	public ArrayList<JWTUser> getAllUsers();

}
