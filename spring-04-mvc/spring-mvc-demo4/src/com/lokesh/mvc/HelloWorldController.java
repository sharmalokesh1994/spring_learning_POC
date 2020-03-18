package com.lokesh.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/funny")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	
	@RequestMapping("processFormVersionTwo")
	public String processFormVersionTwo(@RequestParam("studentName") String name, Model model) {
		
		
		
		String result = "Yo "+name.toUpperCase();
		
		model.addAttribute("message",result);
		
		return "helloWorld2";
		
	}

}
