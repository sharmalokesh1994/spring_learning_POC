package com.lokesh.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel ) {
		// Model Attribute used here to bind with JSP
		
		theModel.addAttribute("customer", new Customer());
		
		return "customer-form";
		
	}
	
	
	// We will use @Valid and BindingResult for checking validation
	@RequestMapping("/processForm")
	public String processForm( @Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindings) {
		
		
		if(bindings.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-conf";
		}
		
		
		
	}
	// It will trim String
	// InitBinder will be called before binding process
	@InitBinder
	public void initBinder(WebDataBinder webData) {
		StringTrimmerEditor str = new StringTrimmerEditor(true);
		webData.registerCustomEditor(String.class, str);
		
	}

}
