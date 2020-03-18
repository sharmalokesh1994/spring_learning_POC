package com.lok.prac.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AOLExpression {

	@Pointcut("execution(public void *(..) )")
	public void pointDAO() {};
	
	@Pointcut("execution(public void get*() )")
	public void pointGet() {};
	
	@Pointcut("execution(public void set*() )")
	public void pointSet() {};
	
	
	// combining Pointcut
	@Pointcut("pointDAO() && !(pointGet() || pointSet())")
	public void pointDaoExceptGet_AND_SeT() {};
	
	@Pointcut("execution(* list*(..) )")
	public void pointList() {};
	
	
}
