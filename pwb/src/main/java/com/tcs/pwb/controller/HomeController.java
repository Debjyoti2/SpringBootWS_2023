package com.tcs.pwb.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.pwb.aop.PaymentServiceImpl;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/hello")
	public String sayHi() {
		return "say hi22";
		
	}
	
	@GetMapping("/makepayment")
	public String makePayment(@RequestParam("name") String data) {                                                                                                                                                
		PaymentServiceImpl service = new PaymentServiceImpl();
		String outstr = service.makepayment(data);
		return outstr;
	}

}
