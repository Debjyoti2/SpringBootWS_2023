package com.feignClient.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignClient.service.OpenFeignService;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/userfeign")
public class FeignClientController {
	
	@Autowired
	OpenFeignService service;
	
	@GetMapping("/getfeignuserentity")
//	@HystrixCommand(fallbackMethod = "fallback_getuserEntity", commandProperties = {
//			   @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
	public Users getuserEntity(){
		return service.getuserEntity();
	}
	
//	private String fallback_getuserEntity() {
//		   return "Request fails. It takes long time to response";
//		}

}
