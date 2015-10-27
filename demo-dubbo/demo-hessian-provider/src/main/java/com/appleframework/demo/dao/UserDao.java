package com.appleframework.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.appleframework.demo.entity.User;

@Repository
public class UserDao  {
	
	public List<User> findListByUsername(String username) {
		List<User> list = new ArrayList<User>(); 
		for (int i = 1; i < 100; i++) {
			User user = new User();
			user.setId(i);
			user.setUsername(username + "-" + i);
			list.add(user);
		}
		return list;
	}
	
	public List<User> findAll() {
		List<User> list = new ArrayList<User>(); 
		for (int i = 1; i < 100; i++) {
			User user = new User();
			user.setId(i);
			user.setUsername("xuxuxu" + "-" + i);
		}
		return list;
	}

}
