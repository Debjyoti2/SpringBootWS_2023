package com.feignClient.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignClient.service.RestTemplateService;

@RestController
@RequestMapping("/user")
public class RestTemplateController {
	
	@Autowired
	private RestTemplateService service;

	
	@GetMapping("/getuserentity")
	public Users getuserEntity(){
		return service.getuserEntity();
	}
	
	@GetMapping("/getUserObj")
	public Users getUserObj(){
		return service.getUserObj();
	}
	
	
}
