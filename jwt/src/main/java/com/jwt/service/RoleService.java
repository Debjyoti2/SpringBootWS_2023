package com.jwt.service;

import com.jwt.entities.Role;

public interface RoleService {
  
	public Role saveRole(Role role);
	
	public Role getSingleRole(String roleName);
}
