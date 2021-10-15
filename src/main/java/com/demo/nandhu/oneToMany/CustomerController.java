package com.demo.nandhu.oneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.saveData(customer);
	}
	
	@GetMapping("/listCustomer")
	public List<Customer> listall(){
		return service.listAllData();
	}
}
