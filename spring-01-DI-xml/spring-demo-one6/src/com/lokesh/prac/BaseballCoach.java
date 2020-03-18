package com.lokesh.prac;

public class BaseballCoach implements Coach{
	
	
	FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 30 mins daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
