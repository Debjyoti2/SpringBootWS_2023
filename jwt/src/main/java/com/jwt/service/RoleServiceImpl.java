package com.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.entities.Role;
import com.jwt.repo.RoleRepo;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleRepo roleRepo;
	
	@Override
	public Role saveRole(Role role) {
		return roleRepo.save(role);
	}
	
	@Override
	public Role getSingleRole(String roleName) {
		return roleRepo.findById(roleName).orElseGet(null);
	}

}
