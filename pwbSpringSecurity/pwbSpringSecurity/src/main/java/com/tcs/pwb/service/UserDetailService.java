package com.tcs.pwb.service;

import java.util.List;

import com.tcs.pwb.vo.User;

public interface UserDetailService {
	
	public User getsingleUser(String userName);
	public List<User> getAllUsers();

}
