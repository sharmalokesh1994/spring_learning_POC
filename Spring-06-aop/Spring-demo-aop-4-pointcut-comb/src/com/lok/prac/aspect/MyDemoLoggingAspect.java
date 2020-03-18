package com.lok.prac.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	
	// Reusing PointCut expression in multiple methods
	@Pointcut("execution(public void *() )")
	public void pointDAO() {};
	
	@Pointcut("execution(public void get*() )")
	public void pointGet() {};
	
	@Pointcut("execution(public void set*() )")
	public void pointSet() {};
	
	
	// combining Pointcut
	@Pointcut("pointDAO() && !(pointGet() || pointSet())")
	public void pointDaoExceptGet_AND_SeT() {};
	
	
	@Before("pointDaoExceptGet_AND_SeT()")
	public void beforeAddAccount() {
		System.out.println("Before Account is get called");
	}
	

	@Before("pointDaoExceptGet_AND_SeT()")
	public void beforeUpdateAccount() {
		System.out.println("Before update is get called");
	}
	
}
