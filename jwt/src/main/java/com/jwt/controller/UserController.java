package com.jwt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.entities.JWTUser;
import com.jwt.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@PostMapping("/register")
	public ResponseEntity<JWTUser> saveUser(@RequestBody JWTUser user){
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		JWTUser returnuser = userService.saveUser(user);
		return new ResponseEntity<JWTUser>(returnuser,HttpStatus.OK);
	}
	
	@GetMapping("/getsingleuser/{userName}")
	@PreAuthorize("hasRole('User')")
	public ResponseEntity<JWTUser> getSingleUser(@PathVariable("userName") String userName){
		JWTUser retrJwtUser = userService.getSingleUser(userName);
		return new ResponseEntity<JWTUser>(retrJwtUser,HttpStatus.OK);
	}	
	
	@GetMapping("/getallusers")
	@PreAuthorize("hasRole('Admin')")
	public ResponseEntity<ArrayList<JWTUser>> getAllUsers(){
		ArrayList<JWTUser> users = new ArrayList<>();
		users = userService.getAllUsers();
		return new ResponseEntity<ArrayList<JWTUser>>(users,HttpStatus.OK);
	}
	
}
