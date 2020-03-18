package com.lok.prac.dao;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class FortuneService {
	
	public String getFortune() {
		System.out.println("Inside getFortune");
		try {
			
			TimeUnit.SECONDS.sleep(5);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		int c = 1/0;
		
		return "Expect heavy traffic today";
	}

}
