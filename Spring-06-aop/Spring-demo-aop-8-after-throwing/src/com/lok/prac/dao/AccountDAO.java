package com.lok.prac.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	
	String name;
	
	public void addAccount(int a,int b) {
		System.out.println("Account adding is in progress");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Integer> listAccount(int a,int b,int c) {
		System.out.println("Account adding is in progress");
		
		List<Integer> t = new ArrayList<>();
		t.add(a);
		t.add(b);
		t.add(c);
		
		return t;
	}
	
	// After throwing
	public int listAccount(int a,int b) {
		return a/b;
	}
	
	
}
