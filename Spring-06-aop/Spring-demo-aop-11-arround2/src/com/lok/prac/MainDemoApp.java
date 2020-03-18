package com.lok.prac;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lok.prac.dao.FortuneService;


public class MainDemoApp {

	static Logger logger = Logger.getLogger(MainDemoApp.class.getName());
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		FortuneService fortune = context.getBean("fortuneService",FortuneService.class);
		
		logger.info(fortune.getFortune());
		
		
		context.close();
		
	}
	
}
