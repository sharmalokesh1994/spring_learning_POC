package com.lok.prac;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach tCoach1 = context.getBean("tCoach",TennisCoach.class);
		
		TennisCoach tCoach2 = context.getBean("tCoach",TennisCoach.class);
		System.out.println(tCoach1==tCoach2);
		
		context.close();

	}

}
