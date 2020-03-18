package com.lokesh.prac;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	CricketCoach(){
		System.out.println("Inside No Arg con");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play Cricket 15 mins daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Setter Method");
		
		this.fortuneService = fortuneService;
	}
	
	

}
