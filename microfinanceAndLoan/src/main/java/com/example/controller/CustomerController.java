package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.service.CustomerService;
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping(value="/customers")

	public List <Customer> getCustomer(Customer customer) {
		return customerService.getCustomer(customer);
	}
	
	@PostMapping (value = "/customer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		Customer customerResponse = customerService.saveCustomer(customer);
		return customerResponse;
	}
	@DeleteMapping(value = "/customers/{id}")
	public void deleteById(@PathVariable Long id) {
		customerService.delete(id);
	}

}
