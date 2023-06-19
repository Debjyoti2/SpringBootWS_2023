package com.feignClient.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feignClient.service.OpenFeignService;

@RestController
@RequestMapping("/userfeign")
public class FeignClientController {
	
	@Autowired
	OpenFeignService service;
	
	@GetMapping("/getfeignuserentity")
	public Users getuserEntity(){
		return service.getuserEntity();
	}

}
