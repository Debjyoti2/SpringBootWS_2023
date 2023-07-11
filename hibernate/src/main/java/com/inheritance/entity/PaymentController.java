package com.inheritance.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	
	@PostMapping("/savecreditcardpayment")
	public CreditCardPayment savepayment(@RequestBody CreditCardPayment creditCardPayment) {
		return service.savepayment(creditCardPayment);
	}

}
