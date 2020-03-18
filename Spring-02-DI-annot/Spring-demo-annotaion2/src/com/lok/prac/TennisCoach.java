package com.lok.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tCoach")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	TennisCoach(){
		
	}
	
	@Autowired
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
