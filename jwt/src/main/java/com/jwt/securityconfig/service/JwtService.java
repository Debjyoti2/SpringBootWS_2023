package com.jwt.securityconfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jwt.securityconfig.CustomUserDetailsService;
import com.jwt.securityconfig.model.JwtRequest;
import com.jwt.securityconfig.util.JwtUtil;

@Service
public class JwtService {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	
	
	public String login(JwtRequest jwtRequest) throws Exception {
		
		try {
			authenticationManager.authenticate( 
					new UsernamePasswordAuthenticationToken(jwtRequest.getUserName(), jwtRequest.getUserPassword()));
		}
		catch (UsernameNotFoundException e) {
			throw new UsernameNotFoundException("");
		}
		catch(BadCredentialsException e) {
			throw new BadCredentialsException("");
		}
		
		
		UserDetails userDetails  = customUserDetailsService.loadUserByUsername(jwtRequest.getUserName()); 
		String jwttoken = jwtUtil.generateToken(userDetails);
		return jwttoken;
	}

}
