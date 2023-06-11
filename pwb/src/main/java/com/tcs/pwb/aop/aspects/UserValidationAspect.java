package com.tcs.pwb.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserValidationAspect {
	
	@Pointcut(value="execution(* com.tcs.pwb.aop.*.*(..))")
	public void validateUserPointCut() {
		
	}
	
	@Before("validateUserPointCut()")
	public void validateUserifLoggedIn(JoinPoint jointPoint) {
		System.out.println("before cheked User logged in !!!!!!");
	}

}
