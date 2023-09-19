package com.transctional.isolation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transctional.isolation.entities.Customer;
import com.transctional.isolation.service.ZomatoOrderService;
import com.transctional.isolation.util.model.OrderInputObject;
import com.transctional.isolation.util.model.ResponseObject;

@RestController
public class ZomatoOrderController {
	
	@Autowired
	private ZomatoOrderService zomatoOrderService;
	
	
	@PostMapping("/doorder")
	public ResponseEntity<ResponseObject> doOrder (@RequestBody OrderInputObject orderObject){
		
		Customer customer = zomatoOrderService.doOrder(orderObject);
		ResponseObject responseObject =new ResponseObject();
		responseObject.setResponseCode(1000);
		responseObject.setResponseMassage("Saved Successfully");
		responseObject.setResponseoutput1(customer);
		return new ResponseEntity<ResponseObject>(responseObject,HttpStatus.OK);
		
	}

}
