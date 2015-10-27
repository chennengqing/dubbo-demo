package com.appleframework.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.appleframework.demo.dao.UserDao;
import com.appleframework.demo.entity.User;
import com.appleframework.demo.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	public List<User> findListByUsername(String username) {
		return userDao.findListByUsername(username);
	}

	@Override
	public List<User> findAll() {
		return null;
	}

	
	
}
