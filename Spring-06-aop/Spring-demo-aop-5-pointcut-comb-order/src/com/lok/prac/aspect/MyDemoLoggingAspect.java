package com.lok.prac.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

	
	// Reusing PointCut expression in multiple methods
	
	
	
	@Before("AOLExpression.pointDaoExceptGet_AND_SeT()")
	public void beforeAddAccount() {
		System.out.println("beforeAddAccount Order 3");
	}
	

	
	
	
}
