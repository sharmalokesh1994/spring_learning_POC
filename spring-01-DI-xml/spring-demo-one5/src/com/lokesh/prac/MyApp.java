package com.lokesh.prac;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		
		// Create Object of Application Context
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from applicationCotext
		
		CricketCoach theCoach = context.getBean("myCricket",CricketCoach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmail());
		
		//close context
		
		context.close();
		

	}

}
