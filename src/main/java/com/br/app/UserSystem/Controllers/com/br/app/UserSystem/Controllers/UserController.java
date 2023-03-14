package com.br.app.UserSystem.Controllers.com.br.app.UserSystem.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.app.UserSystem.Models.Entities.User;
import com.br.app.UserSystem.Models.Repositories.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/login/{id}")
	public User UserbyId(@PathVariable("id") int id) {
		User lUsers = userRepository.findById(id).get();
		return lUsers;
	}
	@GetMapping("/all")
	public List<User> AllUsers() {
		Iterable<User> users = userRepository.findAll();
		return (List<User>) users;
	}
	
	@PostMapping("/register")
	public User RegisterUser(@RequestBody User user) {
		userRepository.save(user);
		return user;
	}
}
