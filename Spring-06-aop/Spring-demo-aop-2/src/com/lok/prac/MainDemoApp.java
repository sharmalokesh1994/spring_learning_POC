package com.lok.prac;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lok.prac.dao.Account;
import com.lok.prac.dao.AccountDAO;
import com.lok.prac.dao.MembershipDAO;

public class MainDemoApp {

	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
		
		
		accountDAO.addAccount();
		
		membershipDAO.addAccount();
		
		membershipDAO.updateAccount();
		
		
		accountDAO.addAccount(new Account() );
		
		accountDAO.addAccount(new Account(),5,4,3 );
		
		context.close();
		
	}
	
}
