package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl ()
	{
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		this.customerRepository = customerRepository;
	}
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}
