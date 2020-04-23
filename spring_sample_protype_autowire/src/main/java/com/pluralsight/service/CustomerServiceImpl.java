package com.pluralsight.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

@Service("customerService")
@Profile("dev")
public class CustomerServiceImpl implements CustomerService {

private CustomerRepository customerRepository;
	

    public CustomerServiceImpl ()
    {
	 System.out.println("CustomerServiceImpl no args constructor");
    }
    
    @Autowired
	public CustomerServiceImpl (CustomerRepository repository)
	{
		customerRepository = repository;
		System.out.println("CustomerServiceImpl repostory constructor");
    }
	
    @PostConstruct
    private void initialize() 
    {
    	System.out.println("we are called after the constructors");
    }
	
	@Override 
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	//@Autowired this go with the no arg constructor
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("CustomerServiceImpl setter");
		
	}
}
