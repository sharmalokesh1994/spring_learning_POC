package com.springSecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogInController {

	
	@RequestMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		return "plain-login";
	}
	
	
	
	@RequestMapping("/access-denied")
	public String showAccessPage() {
		return "access-denied";
	}
}
