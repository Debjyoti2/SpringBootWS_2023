package com.jwt.securityconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.securityconfig.model.JwtRequest;
import com.jwt.securityconfig.model.JwtResponse;
import com.jwt.securityconfig.service.JwtService;

@RestController
public class JwtController {
	
	@Autowired
	private JwtService jwtService;

	@PostMapping("/login")
	public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest jwtRequest) throws Exception{
		String jwttoken  = jwtService.login(jwtRequest);
		JwtResponse jwtResponse = new JwtResponse();
		jwtResponse.setUserName(jwtRequest.getUserName());
		jwtResponse.setJwtToken(jwttoken);
		return new ResponseEntity<JwtResponse>(jwtResponse,HttpStatus.OK);
	}
	
}
