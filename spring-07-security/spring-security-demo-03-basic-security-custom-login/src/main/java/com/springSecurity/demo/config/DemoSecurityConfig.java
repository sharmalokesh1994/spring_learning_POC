package com.springSecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

// For Configurations
@Configuration
// for enabling Spring Security Annotations
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(auth);
		
		// it is used for authentication
		
		// Users are created
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
			.withUser(users.username("john").password("admin").roles("EMPLOYEE"))
			.withUser(users.username("mary").password("admin").roles("MANAGER"))
			.withUser(users.username("susan").password("admin").roles("ADMIN"));
		
	}

	
	// This Method configure the security for webPaths in Application Login Logout etc..
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		
		http.authorizeRequests()//restrict access based on http servlet request
			.anyRequest()//it represent any http request
			.authenticated()//request must be authenticated
			.and() //&&
			.formLogin()//it will configure custom login
				.loginPage("/showMyLoginPage")//we need to create requestMapping for login-page(create controller)
				.loginProcessingUrl("/authenticateTheUser")//we need not create this mapping. It will be used by spring automatically to check usename password
				.permitAll();//it will show login page to all
	}
	
	
	
	

}
