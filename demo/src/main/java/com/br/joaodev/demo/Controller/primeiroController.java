package com.br.joaodev.demo.Controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class primeiroController {
	ArrayList<User> users = new ArrayList<User>();

	@GetMapping("/")
	public ArrayList<User> GetUsers() {
		return users;

	}
	@PostMapping("/user")
	public User teste(@RequestBody User user) {
		users.add(user);
		return user;
	}
}
