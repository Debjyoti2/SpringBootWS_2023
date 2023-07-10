package com.jwt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CommonExceptionHandler {
	
	@ExceptionHandler(value = UsernameNotFoundException.class)
	public ResponseEntity<String> usernameNotFoundException(){
		return new ResponseEntity<String>("User Name Not Found", HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = BadCredentialsException.class)
	public ResponseEntity<String> badCredentialsException(){
		return new ResponseEntity<String>("Bad Credentials ", HttpStatus.BAD_REQUEST);
	}
	
	

}
