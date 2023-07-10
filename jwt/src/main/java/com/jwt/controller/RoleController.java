package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entities.Role;
import com.jwt.service.RoleService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@PostMapping("/saverole")
	public ResponseEntity<Role> saveRole(@RequestBody Role role){
		log.info(" calling saveRole ");
		Role returnRole = roleService.saveRole(role);
		return new ResponseEntity<Role>(returnRole,HttpStatus.OK);
	}
	
	@GetMapping("/getsinglerole/{roleName}")
	public  ResponseEntity<Role> getSingleRole(@PathVariable("roleName") String roleName){
		log.info(" calling getSingleRole ");
		Role returnRole = roleService.getSingleRole(roleName);
		return new ResponseEntity<Role>(returnRole,HttpStatus.OK);
	}
	
}
