package com.tcs.pwb.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserValidationAspect {
	
	@Before(value="execution(* com.tcs.pwb.aop.PaymentServiceImpl.makepayment())")
	public void validateUserifLoggedIn() {
		System.out.println("cheked User logged in !!!!!!");
	}

}
