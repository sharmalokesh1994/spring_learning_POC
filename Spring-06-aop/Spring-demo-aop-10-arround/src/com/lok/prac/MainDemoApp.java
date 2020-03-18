package com.lok.prac;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lok.prac.dao.FortuneService;


public class MainDemoApp {

	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		FortuneService fortune = context.getBean("fortuneService",FortuneService.class);
		
		System.out.println(fortune.getFortune());
		
		
		context.close();
		
	}
	
}
