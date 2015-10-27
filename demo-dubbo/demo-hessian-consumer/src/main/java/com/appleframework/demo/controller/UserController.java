package com.appleframework.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.appleframework.demo.entity.User;
import com.appleframework.demo.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	public String helloworld(Model model) {
		List<User> list = userService.findListByUsername("xusm");
		model.addAttribute("list", list);
		return "userlist";
	}
}
