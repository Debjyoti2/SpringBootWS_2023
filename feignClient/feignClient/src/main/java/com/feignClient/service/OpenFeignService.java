package com.feignClient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.feignClient.model.Users;

@FeignClient(name ="USER-FEIGN-CLIENT",url = "https://api.github.com")
public interface OpenFeignService {

	@GetMapping(value = "/users/amila")
	public Users getuserEntity();
	
}
