package com.lok.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tCoach")
public class TennisCoach implements Coach {

	
	// No need to Use Setter or Constructor
	// If one interface have two child component than we have to use Qualifier otherwise Spring will get confuse while injecting object
	@Autowired
	@Qualifier("RAndomFortuneService")
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
