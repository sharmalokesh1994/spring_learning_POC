package com.lokesh.prac;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		
		// Create Object of Application Context
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from applicationCotext
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		// Use the method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		//close context
		
		context.close();
		

	}

}
