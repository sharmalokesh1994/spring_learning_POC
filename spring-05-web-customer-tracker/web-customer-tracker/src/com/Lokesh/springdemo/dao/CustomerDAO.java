package com.Lokesh.springdemo.dao;

import java.util.List;

import com.Lokesh.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	void saveCustomers(Customer customer);

	Customer getCustomer(int id);

	public void delete(Customer customer);

}
