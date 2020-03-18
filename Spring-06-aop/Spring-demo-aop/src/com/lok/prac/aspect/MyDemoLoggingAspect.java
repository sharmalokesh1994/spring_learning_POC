package com.lok.prac.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	
	
	// This method will be called by spring on each addAccount() method irrespective of class(means this is independent of class)
	@Before("execution(public void addAccount() )")
	public void beforeAddAccount() {
		System.out.println("Before Account is get called");
	}
	
	
	
	// wild-Card Pointcut expression 
	@Before("execution(public void update*() )")
	public void beforeUpdateAccount() {
		System.out.println("Before update is get called");
	}
	
}
