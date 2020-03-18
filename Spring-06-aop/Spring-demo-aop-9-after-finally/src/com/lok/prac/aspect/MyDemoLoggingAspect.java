package com.lok.prac.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.cache.interceptor.CacheOperationInvoker.ThrowableWrapper;
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
		
//		MethodSignature method = (MethodSignature) jp.getSignature();
//		
//		System.out.println("Method : "+method);
//		
//		
//		// Read Method Argument
//		
//		
//		Object arg[] = jp.getArgs();
//		
//		for(Object o:arg) {
//			System.out.println(o.toString());
//		}
		
	}
	
	@AfterReturning(pointcut="AOLExpression.pointList()", returning="result")
	public void afterListAccount(JoinPoint jp,List<Integer> result) {
		System.out.println("afterlistAccount");
		
		// Method signature = Method properties
		
//		MethodSignature method = (MethodSignature) jp.getSignature();
//		
//		System.out.println("Method : "+method);
//		
//		
//		// Read Method Argument
//		
//		
//		Object arg[] = jp.getArgs();
//		
//		for(Object o:arg) {
//			System.out.println(o.toString());
//		}
		
		
		// result
		
		System.out.println("Result : "+result);
		
	}
	
	
	@AfterThrowing(pointcut="AOLExpression.pointList()", throwing="exc")
	public void afterThrowing(JoinPoint jp,Throwable exc) {
//		System.out.println("afterlistAccount");
//		
//		// Method signature = Method properties
//		
//		MethodSignature method = (MethodSignature) jp.getSignature();
//		
//		System.out.println("Method : "+method);
//		
//		
//		// Read Method Argument
//		
//		
//		Object arg[] = jp.getArgs();
//		
//		for(Object o:arg) {
//			System.out.println(o.toString());
//		}
		
		
		// result
		
		System.out.println("Exception in AfterThrowing advise : "+exc);
		
	}

	
	
	// It is finally method
	// It will called before return;
	@After("AOLExpression.pointList()")
	public void after(JoinPoint jp) {
		System.out.println("Inside after");
		
		// Method signature = Method properties
		
//		MethodSignature method = (MethodSignature) jp.getSignature();
//		
//		System.out.println("Method : "+method);
//		
//		
//		// Read Method Argument
//		
//		
//		Object arg[] = jp.getArgs();
//		
//		for(Object o:arg) {
//			System.out.println(o.toString());
//		}
		
		
		
	
		
	}
	
}
