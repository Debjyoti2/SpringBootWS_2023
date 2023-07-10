package com.pwb.demo.factorydesignpattern;

public class BankAccountFactory {
	
	public static BankAccount getInstances(String accoutType) {
		
		BankAccount bankAccount=null;
		
		if(accoutType.equals("BUSINESS")) {
			return new BusinessAccount();
		}
		else if(accoutType.equals("PERSONAL")) {
			return new PersonalAccount();
		}
		else if(accoutType.equals("CHECKING")) {
			return new CheckingAccount();
		}
		
		return bankAccount;
		
	}
	

}
