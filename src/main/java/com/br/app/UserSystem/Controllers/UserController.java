package com.br.app.UserSystem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.app.UserSystem.Models.Entities.User;
import com.br.app.UserSystem.Models.Repositories.UserRepository;

@RestController
@RequestMapping("/teste")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	public User TesteValues(@RequestBody String email) {
		User user = new User(email,"teste");
		return user;
	}
}
