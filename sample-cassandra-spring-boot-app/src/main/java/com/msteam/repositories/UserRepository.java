package com.msteam.repositories;

import org.springframework.data.repository.CrudRepository;

import com.msteam.entities.User;

public interface UserRepository extends CrudRepository<User, String> {
	
}
