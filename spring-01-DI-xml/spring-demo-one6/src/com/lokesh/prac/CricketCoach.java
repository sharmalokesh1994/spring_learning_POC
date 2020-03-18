package com.lokesh.prac;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String team;
	private String email;
	
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

	public void setTeam(String team) {
		this.team = team;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public String getEmail() {
		return email;
	}
	
	
	
	

}
