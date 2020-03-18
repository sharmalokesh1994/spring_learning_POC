package com.lok.prac.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	
	String name;
	
	public void addAccount() {
		System.out.println("Account adding is in progress");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
