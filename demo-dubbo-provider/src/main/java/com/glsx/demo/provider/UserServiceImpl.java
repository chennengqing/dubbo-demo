package com.glsx.demo.provider;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.glsx.demo.common.model.User;
import com.glsx.demo.common.service.UserService;

/**
 * Hello world!
 * 
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public List<User> findAll() {
		List<User> list = new ArrayList<User>();
		for (int i = 0; i < 100; i++) {
			User user = new User();
			user.setId(i);
			user.setName("tttt--" + i);
			list.add(user);
		}
		return list;
	}

}
