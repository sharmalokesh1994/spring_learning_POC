package com.lokesh.prac;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
		String arr[]= {"Lucky","best","fortunate"};
		
		int a = (int) (Math.random()*3);
		
		System.out.println(a);
		
		return arr[a];
	}

}
