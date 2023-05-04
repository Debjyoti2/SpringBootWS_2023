package com.tcs.pwb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.pwb.service.SignInService;
import com.tcs.pwb.vo.User;

@RestController
@RequestMapping("/signin")
public class SignInController {
	
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	@Autowired
	private SignInService signInService;
	
	@RequestMapping(value = "/usersignin",method = RequestMethod.POST,produces = "application/json")
	public ResponseEntity<User> signin(@RequestBody User user){
		
		user.setPassword(this.bcryptPasswordEncoder.encode(user.getPassword()));
		
		User retuser = new User(); 
		retuser= this.signInService.signin(user);
		
		return ResponseEntity.ok(retuser);
		
	}
	
	

}
