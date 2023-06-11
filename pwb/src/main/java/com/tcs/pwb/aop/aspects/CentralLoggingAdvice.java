package com.tcs.pwb.aop.aspects;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CentralLoggingAdvice {
	
	private Logger logger = LoggerFactory.getLogger(CentralLoggingAdvice.class);
	
	@Pointcut(value = " execution(* com.tcs.pwb.*.*.*(..))")
	public void myPointCut() {
		
	}
	
	@Around("myPointCut()")
	public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
		
		String methodName=pjp.getSignature().getName();
		String className = pjp.getClass().toString();
		Object[] objarray = pjp.getArgs();
		
		logger.info(className + "   :::  " +  methodName + " :: " +  Arrays.toString(objarray));
		
		Object object  = pjp.proceed();
		
		logger.info(className + "   :::  " +  methodName + " :: " +  object);
		
		return object;
	}
	
	

}
