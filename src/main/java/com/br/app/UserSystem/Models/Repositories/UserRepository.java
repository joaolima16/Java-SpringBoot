package com.br.app.UserSystem.Models.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.br.app.UserSystem.Models.Entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}
