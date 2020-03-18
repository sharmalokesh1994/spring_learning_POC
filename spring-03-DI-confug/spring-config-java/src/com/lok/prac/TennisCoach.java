package com.lok.prac;

import org.springframework.stereotype.Component;

@Component("tCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "Play Tennis 15 mins Daily";
	}

}
