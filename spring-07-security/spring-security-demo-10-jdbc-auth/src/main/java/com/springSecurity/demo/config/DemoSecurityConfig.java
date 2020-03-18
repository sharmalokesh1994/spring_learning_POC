package com.springSecurity.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
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

	
	@Autowired
	private DataSource securityDataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// use jdbc authentication ... oh yeah!!!
		
		auth.jdbcAuthentication().dataSource(securityDataSource);
		
	}

	
	// This Method configure the security for webPaths in Application Login Logout etc..
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(http);
		
		http.authorizeRequests()//restrict access based on http servlet request
			.antMatchers("/").hasRole("EMPLOYEE")//home can be opened by all employees
			.antMatchers("/leaders/**").hasRole("MANAGER")// only Managers can open this
			.antMatchers("/systems/**").hasRole("ADMIN")// only Admin can open this
			.and() //&&
			.formLogin()//it will configure custom login
				.loginPage("/showMyLoginPage")//we need to create requestMapping for login-page(create controller)
				.loginProcessingUrl("/authenticateTheUser")//we need not create this mapping. It will be used by spring automatically to check usename password
				.permitAll()//it will show login page to all
			.and()
			.logout()
			.permitAll()//it will show logout page to all
			.and()
			.exceptionHandling().accessDeniedPage("/access-denied");// if user does not have the access to resource access denied page will be displayed
	}
	
	
	
	

}
