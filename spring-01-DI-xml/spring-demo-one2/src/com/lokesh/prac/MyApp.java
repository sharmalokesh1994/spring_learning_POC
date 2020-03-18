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
		
		
		// retrieve bean from applicationCotext
		
		Coach myNewCoach = context.getBean("myNewCoach",Coach.class);
		
		// Use the method
		System.out.println(myNewCoach.getDailyWorkout());
		
		//close context
		
		context.close();
		

	}

}
