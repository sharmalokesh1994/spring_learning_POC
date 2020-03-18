package com.lok.prac;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.lok.prac")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public TennisCoach tCoach() {
		return new TennisCoach(happyFortuneService());
	}

}
