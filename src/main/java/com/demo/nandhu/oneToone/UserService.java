package com.demo.nandhu.oneToone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	String requestID = "XXXX";

	public User saveUser(User user) {

		Project project = new Project();
		project.setProjectName("Java project");

		user.setProject(project);

		return userRepo.save(user);
	}

	public List<User> userDetails() {
		return userRepo.findAll();
	}

}
