package com.pwb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pwb.demo.service.SignInService;
import com.pwb.demo.vo.SignInEmployee;

@RestController
@RequestMapping("/signin")
public class SignInController {

	@Autowired
	private SignInService service;
	
	@RequestMapping(value = "/doSignin",method = RequestMethod.GET,produces = "application/json")
	public ResponseEntity<SignInEmployee> doSignin(@RequestParam("userName") String userName, @RequestParam("userEmail") String userEmail) {
		
		SignInEmployee e = new SignInEmployee();
		
		System.out.println(userName + userEmail);
		
		e=service.doSignin(userName,userEmail);
		
		if(e.getUserId()>0) {
			return ResponseEntity.ok(e);
		}
		return ResponseEntity.notFound().build();
		
	}
	
	
}
