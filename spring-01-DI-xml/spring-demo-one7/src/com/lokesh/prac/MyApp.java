package com.lokesh.prac;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		
		// Create Object of Application Context
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from applicationCotext
		//Bean Scope
		
		CricketCoach theCoach = context.getBean("myCricket",CricketCoach.class);
		
		CricketCoach theCoach1 = context.getBean("myCricket",CricketCoach.class);
		
		boolean check = (theCoach == theCoach1) ;
		
		System.out.println(check);
		
		System.out.println(theCoach);
		System.out.println(theCoach1);
		
		
		//Bean LifeCycle
		
	//	TrackCoach tCoach = context.getBean("myNewCoach",TrackCoach.class);
		
		//close context
		
		context.close();
		

	}

}
