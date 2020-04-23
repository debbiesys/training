package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("CustomerRepository")
@Profile("dev")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Autowired
	private Calendar cal;
	
	@Value("#{ T(java.lang.Math).random() * 100}")
	private double seedNum;
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Debbie");
		customer.setLastname("Sheu");
		customer.setSeedNum(seedNum);
		
		
		System.out.println("cal: " + cal.getTime());
		
		customers.add(customer);
		
		return customers;
	}
}
