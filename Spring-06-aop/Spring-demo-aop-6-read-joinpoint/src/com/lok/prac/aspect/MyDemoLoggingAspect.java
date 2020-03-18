package com.lok.prac.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

	
	// Reusing PointCut expression in multiple methods
	// Here we are using JoinPoint to get the infprmation about the calling method
	@Before("AOLExpression.pointDaoExceptGet_AND_SeT()")
	public void beforeAddAccount(JoinPoint jp) {
		System.out.println("beforeAddAccount Order 3");
		
		// Method signature = Method properties
		// Signature Example Method : void com.lok.prac.dao.AccountDAO.addAccount(int,int)
		MethodSignature method = (MethodSignature) jp.getSignature();
		
		System.out.println("Method : "+method);
		
		
		// Read Method Argument values
		Object arg[] = jp.getArgs();
		
		for(Object o:arg) {
			System.out.println(o.toString());
		}
		
	}
	

	
	
	
}
