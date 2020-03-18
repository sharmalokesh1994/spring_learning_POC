package com.lokesh.prac;

public class TrackCoach implements Coach {
	
	
	public void initBean() {
		System.out.println("initBean");
	}
	
	public void destroyBean() {
		System.out.println("destroyBean");
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run 5k hard";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
