package com.lok.prac.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	
	// Reusing PointCut expression in multiple methods
	@Pointcut("execution(public void *Account() )")
	public void pointDAO() {};
	
	@Before("pointDAO()")
	public void beforeAddAccount() {
		System.out.println("Before Account is get called");
	}
	

	@Before("pointDAO()")
	public void beforeUpdateAccount() {
		System.out.println("Before update is get called");
	}
	
}
