package com.lok.prac;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach tCoach = context.getBean("tCoach",TennisCoach.class);
		
		System.out.println(tCoach.getDailyWork());
		
		//AutoWiring
		System.out.println(tCoach.getDailyFortune());
		
		
		System.out.println(tCoach.getName());
		System.out.println(tCoach.getTeam());
		
		context.close();

	}

}
