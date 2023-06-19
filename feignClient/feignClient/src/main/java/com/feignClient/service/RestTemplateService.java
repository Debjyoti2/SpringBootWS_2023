package com.feignClient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.feignClient.model.Users;

@Service
public class RestTemplateService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String URL="https://api.github.com/users/amila";
	
	
	public Users getuserEntity() {
		Users user =  restTemplate.getForEntity(URL, Users.class).getBody();
		return user;
	}
	
	public Users getUserObj() {
		return restTemplate.getForObject(URL,Users.class);
	}
	

}
