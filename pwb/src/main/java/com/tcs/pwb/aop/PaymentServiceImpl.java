package com.tcs.pwb.aop;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Override
	public String makepayment(String data) {

		System.out.println("Amount debited from account 1");
		
		
		
		
		System.out.println("Amount credited  to account 2");
		
		return "output str";
	}

}
