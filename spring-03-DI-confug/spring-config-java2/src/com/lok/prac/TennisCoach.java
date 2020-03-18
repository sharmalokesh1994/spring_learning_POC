package com.lok.prac;

public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;

	TennisCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "Play Tennis 15 mins Daily";
	}
	
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
