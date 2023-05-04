package com.tcs.pwb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.pwb.service.UserDetailService;
import com.tcs.pwb.vo.User;

@RestController
@RequestMapping("/user")
public class UserDetailsController {
	
	@Autowired
	private UserDetailService service;

	@GetMapping("/getuser/{userName}")
	public ResponseEntity<User> getuser(@PathVariable("userName") String userName) {
		User user = service.getsingleUser(userName);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/getalluser")
	public ResponseEntity<List<User>> getalluser() {
		List<User> users = new ArrayList<User>();
		users = service.getAllUsers();
		return ResponseEntity.ok(users);
				
	}
	
	
}
