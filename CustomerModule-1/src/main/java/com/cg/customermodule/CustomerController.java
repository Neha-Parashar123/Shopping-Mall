package com.cg.customermodule;


import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	//Retrieve All
	@GetMapping("/Customer")
	public List<Customer> listAll() {
		return service.listAll();
	}
	
	//Retrieve by Id
	@GetMapping("/Customers/{id}")
	public ResponseEntity<Customer> get(@PathVariable Integer id) {
		try {
			Customer customer = service.get(id);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
			
		}
		catch (Exception e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
		
	}
	//create
	@PostMapping("/Customers")
	public void add(@RequestBody Customer customer) {
		service.save(customer);
		
	}
	
	//update
	@PutMapping("/customers/{id}")
	public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Integer id) {
		try {
			Customer existcustomer = service.get(id);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
			
		}
		catch (Exception e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	//delete
	@DeleteMapping("/customers/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	

}
