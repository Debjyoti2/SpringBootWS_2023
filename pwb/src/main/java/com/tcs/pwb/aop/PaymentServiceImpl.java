package com.tcs.pwb.aop;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public void makepayment() {

		System.out.println("Amount debited from account 1");
		
		
		
		
		System.out.println("Amount credited  to account 2");
		
	}

}
