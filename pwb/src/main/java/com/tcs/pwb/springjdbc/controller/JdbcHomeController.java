package com.tcs.pwb.springjdbc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.pwb.springjdbc.dao.UserDAO;
import com.tcs.pwb.springjdbc.vo.UserVo;

@RestController
@RequestMapping("/jdbchome")
public class JdbcHomeController {
	
	@Autowired
	UserDAO dao;	
	
	@RequestMapping(value="/getalluser",method = RequestMethod.GET,produces = "application/json")
	public List<UserVo> getallUser(){
		List<UserVo> userList = new ArrayList<UserVo>();
		userList=dao.getallUser();
		return userList;
	} 
	
	//by @PathVariable
	@RequestMapping(value="/getsingleuser/{userid}",method=RequestMethod.GET,produces = "application/json")
	public UserVo fetchSingleUser(@PathVariable("userid") int userid) {
		UserVo user = new UserVo();
		user = dao.fetchSingleUser(userid);
		return user;
	}
	
	//by @RequestParam
	@RequestMapping(value="/getsingleuser",method=RequestMethod.GET,produces = "application/json")
	public UserVo fetchSingleUser2(@RequestParam("userid") int userid) {
		UserVo user = new UserVo();
		user = dao.fetchSingleUser(userid);
		return user;
	}
	
	@RequestMapping(value="/saveuser",method = RequestMethod.POST,produces = "application/json")
	public int saveUser(@RequestBody UserVo user) {
		int rowcount = dao.saveUser(user);
		return rowcount;
	}
	

}
