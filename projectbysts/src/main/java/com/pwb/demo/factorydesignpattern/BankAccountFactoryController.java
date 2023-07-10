package com.pwb.demo.factorydesignpattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountFactoryController {

	@GetMapping("/registerAccount/{accountType}")
	public void  registerAccount(@PathVariable("accountType") String accountType ) {
		
		BankAccount bankAccount = BankAccountFactory.getInstances(accountType);
		bankAccount.registerAccount();
		bankAccount.calculateInterestrate();
		bankAccount.validateUserIdentity();
		
	}
	
}
