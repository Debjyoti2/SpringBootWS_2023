package com.pwb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pwb.demo.service.GenderService;
import com.pwb.demo.vo.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier("maleGenderServiceImpl")
	private GenderService service1;
	
	@Autowired
	@Qualifier("femaleGenderServiceImpl")
	private GenderService service2;
	
	@RequestMapping(value="/saveuser",method=RequestMethod.POST)
	public ResponseEntity<String> saveUser(@RequestBody  User user){

		String sysdate="12-01-1992";

//		if(user.getDob() == sysdate){
//			return ResponseEntity.ok("Not valid date");
//
//		}
		if(user.getGender().equalsIgnoreCase("M")){

			User savedUser = this.service1.saveUser(user);

		}
		else
		{
			User savedUser= this.service2.saveUser(user);

		}

		return ResponseEntity.ok("user saved");


	}




}
