package com.example.service;

import org.springframework.stereotype.Component;

import com.example.entity.Customer;
@Component
public interface CustomerInter {
	public Customer saveCustomer(Customer customer);
	public Customer findByCustomerId(Long customerId);
}
