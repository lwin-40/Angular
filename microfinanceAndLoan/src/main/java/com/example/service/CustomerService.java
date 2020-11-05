package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customer;
import com.example.entity.Member;
import com.example.repository.CustomerRepository;
@Service("CustomerInter")
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
public List <Customer> getCustomer(Customer customer) {
	return customerRepository.findAll();
}

public Customer saveCustomer(Customer customer) {

	Member member = customer.getMember();
	member.setCustomer(customer);
	customer = customerRepository.save(customer);
	return customer;
}

public void delete(Long id) {
customerRepository.deleteById(id);	
}
}