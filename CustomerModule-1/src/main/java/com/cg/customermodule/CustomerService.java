package com.cg.customermodule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

@Service
@Transactional


public class CustomerService {
	@Autowired
	private CustomerRepository repo;
	
	//Retrieve all
	public List<Customer> listAll() {
		return repo.findAll();
		
	}
	
	//Retrieve by id and update
	public Customer get(Integer id) {
		return repo.findById(id).get();
	}

	
	//create and update
	public void save (Customer customer) {
		repo.save(customer);
		
	}
	//update

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
}
