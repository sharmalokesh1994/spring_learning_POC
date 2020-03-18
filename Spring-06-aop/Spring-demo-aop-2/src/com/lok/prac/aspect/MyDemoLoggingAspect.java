package com.lok.prac.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// This method will be called by spring on each addAccount() method irrespective
	// of class(means this is independent of class)
	@Before("execution(public void addAccount() )")
	public void beforeAddAccount() {
		System.out.println("Before Account is get called");
	}

	// wild-Card Pointcut expression
	@Before("execution(public void update*() )")
	public void beforeUpdateAccount() {
		System.out.println("Before update is get called");
	}
	
	// Single argument specific type in specific class
		@Before("execution(public void com.lok.prac.dao.AccountDAO.addAccount(com.lok.prac.dao.Account ) )")
		public void beforeAddAccountSpecificParameterizedInSpecificClass() {
			System.out.println("Before Account is get called : beforeAddAccountSpecificParameterized");
		}

	// Single argument specific type
	@Before("execution(public void addAccount(com.lok.prac.*.Account ) )")
	public void beforeAddAccountSpecificParameterized() {
		System.out.println("Before Account is get called : beforeAddAccountSpecificParameterized");
	}

	// Single argument of any type
	@Before("execution(public void addAccount(*) )")
	public void beforeAddAccountParameterized() {
		System.out.println("Before Account is get called : beforeAddAccountParameterized");
	}

	// Multiple arguments of any type
	@Before("execution(public void addAccount(..) )")
	public void beforeAddAccountMultipleParameterized() {
		System.out.println("Before Account is get called : beforeAddAccountMultipleParameterized");
	}

}
