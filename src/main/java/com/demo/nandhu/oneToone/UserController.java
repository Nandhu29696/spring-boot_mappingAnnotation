package com.demo.nandhu.oneToone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/add")
	public User userdata(@RequestBody User user) {
		return service.saveUser(user);
	}

	@GetMapping("/listall")
	public List<User> findAlldata() {
		return service.userDetails();
	}
}
