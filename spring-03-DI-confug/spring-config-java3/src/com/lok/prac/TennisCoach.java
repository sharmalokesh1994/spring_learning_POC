package com.lok.prac;

import org.springframework.beans.factory.annotation.Value;

public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	

	@Value("${foo.name}")
	private String name;
	@Value("${foo.team}")
	private String team;

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


	public String getName() {
		return name;
	}


	public String getTeam() {
		return team;
	}
	
	

}
