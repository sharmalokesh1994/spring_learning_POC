package com.lokesh.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	
	@Value("#{countryOptions}")
	LinkedHashMap<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Student theStudent = new Student();
		
		theModel.addAttribute("student", theStudent);
		
		
		theModel.addAttribute("theCountryOptions", countryOptions); 
		
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm( @ModelAttribute("student") Student theStudent ) {
		
		System.out.println("First Name:"+ theStudent.getFirstName());
		
		return "student-conf";
	}


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	
}
