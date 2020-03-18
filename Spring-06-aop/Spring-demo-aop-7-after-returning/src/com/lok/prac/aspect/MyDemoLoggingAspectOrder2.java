package com.lok.prac.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspectOrder2 {

	
	// Reusing PointCut expression in multiple methods
	
	
	
	
	

	@Before("AOLExpression.pointDaoExceptGet_AND_SeT()")
	public void beforeUpdateAccount() {
		System.out.println("beforeAddAccount Order 1");
	}
	
	
	
	
}
