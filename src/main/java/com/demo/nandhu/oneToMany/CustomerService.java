package com.demo.nandhu.oneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	public Customer saveData(Customer customer) {

		Items p1 = new Items();
		p1.setItemname("Java project");

		Items p2 = new Items();
		p2.setItemname("Python project");

		//One to many
		customer.getItems().add(p1);
		customer.getItems().add(p2);

		//Many to One
		p1.setCustomer(customer);
		p2.setCustomer(customer); 
		
		return customerRepo.save(customer);

	}

	public List<Customer> listAllData() {
		return customerRepo.findAll();
	}
}
