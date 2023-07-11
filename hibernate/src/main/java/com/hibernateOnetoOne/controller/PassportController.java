package com.hibernateOnetoOne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernateOnetoOne.entity.Passport;
import com.hibernateOnetoOne.service.PassportService;

@RestController
@RequestMapping("/passport")
public class PassportController {
	
	@Autowired
	private PassportService service;
	
	@GetMapping("/getPassportById/{passportId}")
	public Passport getPassportById(@PathVariable("passportId") Long passportId) {
		return service.getPassportById(passportId);
		
	}
	
	@PostMapping("/savepassport")
	public Passport savePassport(@RequestBody Passport passport) {
		return service.savePassport(passport);
	}

}
