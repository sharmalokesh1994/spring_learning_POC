package com.lok.prac;

import org.springframework.stereotype.Component;

@Component
public class RAndomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Random Fortune";
	}

}
