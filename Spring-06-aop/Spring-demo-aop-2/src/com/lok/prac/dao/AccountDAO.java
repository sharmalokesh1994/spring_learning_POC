package com.lok.prac.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	public void addAccount() {
		System.out.println("Account adding is in progress");
	}
	
	
	public void addAccount(Account ac) {
		System.out.println("Account adding is in progress");
	}
	
	public void addAccount(Account ac,int a,int b,int c) {
		System.out.println("Account adding is in progress");
	}
}
