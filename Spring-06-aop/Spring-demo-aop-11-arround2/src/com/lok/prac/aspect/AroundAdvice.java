package com.lok.prac.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.lok.prac.MainDemoApp;

@Aspect
@Component
public class AroundAdvice {

	static Logger logger = Logger.getLogger(AroundAdvice.class.getName());
	
	@Pointcut("execution(* get*(..))")
	public void aroundPointCut() {}
	
	@Around("aroundPointCut()")
	public Object aroundAdvice( ProceedingJoinPoint theproceedingJoinPoint) throws Throwable  {
		
		logger.info("begin time : " + System.currentTimeMillis());
		
		Object result;
		try {
			result = theproceedingJoinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		logger.info("end time : " + System.currentTimeMillis());
		
		return result;
	}
	
}
