package com.lok.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tCoach")
public class TennisCoach implements Coach {

	
	// No need to Use Setter or Constructor
	@Autowired
	private FortuneService fortuneService;
	


	TennisCoach(){
		
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
