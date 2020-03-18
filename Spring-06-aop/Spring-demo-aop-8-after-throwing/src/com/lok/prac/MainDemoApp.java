package com.lok.prac;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lok.prac.dao.AccountDAO;
import com.lok.prac.dao.MembershipDAO;

public class MainDemoApp {

	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
		
//		
//		accountDAO.addAccount(3,4);
//		
//		System.out.println();
//		
//		accountDAO.setName("abc");
//		System.out.println();
//		accountDAO.getName();
		
		try {
			accountDAO.listAccount(3,0);
		}catch(Exception e){
			System.out.println("Inside Main : " + e);
		}
		
		
		
		context.close();
		
	}
	
}
