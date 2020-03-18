package com.lokesh.prac;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coach theCoach = new BaseballCoach();
		
		System.out.println(theCoach.getDailyWorkout());
		
		Coach theCoach1 = new TrackCoach();
		
		System.out.println(theCoach1.getDailyWorkout());

	}

}
