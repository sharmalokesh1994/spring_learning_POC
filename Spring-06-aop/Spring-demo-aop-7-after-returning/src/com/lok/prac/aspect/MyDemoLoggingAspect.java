package com.lok.prac.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
	
	
	
	@Before("AOLExpression.pointDaoExceptGet_AND_SeT()")
	public void beforeAddAccount(JoinPoint jp) {
		System.out.println("beforeAddAccount Order 3");
		
		// Method signature = Method properties
		
		MethodSignature method = (MethodSignature) jp.getSignature();
		
		System.out.println("Method : "+method);
		
		
		// Read Method Argument
		
		
		Object arg[] = jp.getArgs();
		
		for(Object o:arg) {
			System.out.println(o.toString());
		}
		
	}
	
	
	// It will be called after return statement of the calling Method
	// In After Retruning we can access the result of calling method
	
	@AfterReturning(pointcut="AOLExpression.pointList()", returning="result")
	public void afterListAccount(JoinPoint jp,List<Integer> result) {
		System.out.println("afterlistAccount");
		
		// Method signature = Method properties
		
		MethodSignature method = (MethodSignature) jp.getSignature();
		
		System.out.println("Method : "+method);
		
		
		// Read Method Argument
		
		
		Object arg[] = jp.getArgs();
		
		for(Object o:arg) {
			System.out.println(o.toString());
		}
		
		
		// result
		
		System.out.println("Result : "+result);
		
	}

	
	
	
}
