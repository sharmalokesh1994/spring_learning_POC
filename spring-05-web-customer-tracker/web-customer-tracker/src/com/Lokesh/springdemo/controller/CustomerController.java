package com.Lokesh.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Lokesh.springdemo.dao.CustomerDAO;
import com.Lokesh.springdemo.entity.Customer;
import com.Lokesh.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		
		List<Customer> customers = customerService.getCustomers();
		
		theModel.addAttribute("list_customer",customers);
		
		
		
		return "list-customer";
	}
	
	@RequestMapping("/showFormForAdd")
	public String showForm(Model theModel) {
	
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	
	@RequestMapping("/saveCustomer")
	public String saveCustomer( @ModelAttribute("customer") Customer theCustomer ) {
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
		
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model theModel ) {
		
		Customer theCustomer = customerService.getCustomer(id);
		
		theModel.addAttribute("customer",theCustomer);
		
		return "customer-form";
	}
	
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("customerId") int id, Model theModel ) {
		
		Customer theCustomer = customerService.getCustomer(id);
		customerService.delete(theCustomer);

		return "redirect:/customer/list";
	}
	
}
