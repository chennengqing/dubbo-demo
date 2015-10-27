package com.appleframework.demo.service;

import java.util.List;

import com.appleframework.demo.entity.User;

public interface UserService {

	public List<User> findListByUsername(String username);
	
	public List<User> findAll();
}
