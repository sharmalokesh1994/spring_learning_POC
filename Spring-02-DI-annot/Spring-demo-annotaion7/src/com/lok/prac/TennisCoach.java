package com.lok.prac;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tCoach")
@Scope("prototype")
public class TennisCoach implements Coach {

	
	// No need to Use Setter or Constructor
	@Autowired
	@Qualifier("RAndomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.name}")
	private String name;
	@Value("${foo.team}")
	private String team;


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


	public String getName() {
		return name;
	}


	public String getTeam() {
		return team;
	}
	

}
