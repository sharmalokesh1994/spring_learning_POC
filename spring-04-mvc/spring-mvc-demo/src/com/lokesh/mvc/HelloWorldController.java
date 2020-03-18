package com.lokesh.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
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
	public String processFormVersionTwo(HttpServletRequest req, Model model) {
		
		// Model used to bined data with JSP.
		//JSP can use the model Attribute directly
		
		String name = req.getParameter("studentName");
		
		String result = "Yo "+name.toUpperCase();
		
		model.addAttribute("message",result);
		
		return "helloWorld2";
		
	}

}
