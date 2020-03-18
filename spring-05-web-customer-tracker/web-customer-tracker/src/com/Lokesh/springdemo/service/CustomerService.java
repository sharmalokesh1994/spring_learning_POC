package com.Lokesh.springdemo.service;

import java.util.List;

import com.Lokesh.springdemo.entity.Customer;

public interface CustomerService {

	
	public List<Customer> getCustomers();

	void saveCustomer(Customer customer);

	Customer getCustomer(int id);

	public void delete(Customer theCustomer);
	
}
