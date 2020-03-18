package com.lok.prac.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdvice {

	@Pointcut("execution(* get*(..))")
	public void aroundPointCut() {}
	
	@Around("aroundPointCut()")
	public Object aroundAdvice( ProceedingJoinPoint theproceedingJoinPoint) throws Throwable {
		
		System.out.println("begin time : " + System.currentTimeMillis());
		
		Object result = theproceedingJoinPoint.proceed();
		
		System.out.println("end time : " + System.currentTimeMillis());
		
		return result;
	}
	
}
