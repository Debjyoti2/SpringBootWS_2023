package com.inheritance.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentService{
	
	
	@Autowired
	private PaymentRepo paymentRepo;
	
	@Transactional
	public CreditCardPayment savepayment(CreditCardPayment creditCardPayment) {
		
		return paymentRepo.save(creditCardPayment);
		
	}
	

}
