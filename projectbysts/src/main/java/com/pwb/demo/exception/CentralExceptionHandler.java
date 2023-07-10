package com.pwb.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralExceptionHandler {
	
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<Object> handleNullPointerException() {
		return new ResponseEntity<Object>("Null Pointer Exception",HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(value = NoAccessToEmpFetchException.class)
	public ResponseEntity<Object> handleNoAccessToEmpFetchException(){
		return new ResponseEntity<Object>("NoAccessToEmpFetchException",HttpStatus.BAD_REQUEST);
	}
	
	
	

}
