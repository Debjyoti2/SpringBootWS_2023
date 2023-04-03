package com.tcs.pwb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.pwb.aop.PaymentServiceImpl;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "say hi22";
		
	}
	
	@RequestMapping("/makepayment")
	public void makePayment() {                                                                                                                                                
		PaymentServiceImpl service = new PaymentServiceImpl();
		service.makepayment();
	}

}
