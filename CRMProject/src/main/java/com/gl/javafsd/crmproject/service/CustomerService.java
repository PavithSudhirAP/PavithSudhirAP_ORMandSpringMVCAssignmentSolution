package com.gl.javafsd.crmproject.service;

import java.util.List;

import com.gl.javafsd.crmproject.entity.Customer;


public interface CustomerService {

	List<Customer> listAll();

	Customer findById(int theId);

	void save(Customer theCustomer);

	void deleteById(int theId);

}
