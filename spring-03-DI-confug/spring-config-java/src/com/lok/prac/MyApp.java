package com.lok.prac;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		TennisCoach tCoach = context.getBean("tCoach",TennisCoach.class);
		
		System.out.println(tCoach.getDailyWork());
		
		
		// Default ID check
		
		FaizaCoach fCoach = context.getBean("faizaCoach",FaizaCoach.class);
		
		System.out.println(fCoach.getDailyWork());
		
		context.close();

	}

}
