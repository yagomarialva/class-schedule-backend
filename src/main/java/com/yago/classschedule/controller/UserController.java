package com.yago.classschedule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yago.classschedule.model.User;
import com.yago.classschedule.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/admin")
public class UserController {
	@Autowired
	private UserRepository userRepository;


	
	public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<User> getClassSchedule(){
		return userRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@CrossOrigin(origins = "http://localhost:4200")
	public User setUser(@RequestBody User user) {
		return userRepository.save(user);
	}
}
