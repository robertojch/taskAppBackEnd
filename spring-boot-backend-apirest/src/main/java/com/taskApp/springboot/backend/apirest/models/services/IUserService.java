package com.taskApp.springboot.backend.apirest.models.services;

import com.taskApp.springboot.backend.apirest.models.entity.User;

public interface IUserService {
	
	public User findByUsername(String username);

}
