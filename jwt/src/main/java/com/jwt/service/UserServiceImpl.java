package com.jwt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.entities.JWTUser;
import com.jwt.entities.Role;
import com.jwt.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userrepo;
	
	@Autowired
	private RoleService roleService;
	
	
	@Override
	@Transactional
	public JWTUser saveUser(JWTUser user) {
		JWTUser savedUser =  userrepo.save(user);
		
		Role role = roleService.getSingleRole(user.getRoleName());
		
		savedUser.getRoles().add(role);
		
		return savedUser;
	}
	
	@Override
	public JWTUser getSingleUser(String userName) {
		return userrepo.findById(userName).orElse(null);
	}

	
	@Override
	public ArrayList<JWTUser> getAllUsers() {
		ArrayList<JWTUser> users= (ArrayList<JWTUser>) userrepo.findAll();
		return users;
	}
}
