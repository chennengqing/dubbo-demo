package com.appleframework.boot.demo.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appleframework.web.springmvc.controller.BaseController;
import com.glsx.demo.common.model.User;
import com.glsx.demo.common.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	private static Logger logger = Logger.getLogger(UserController.class);
	
	private String viewModel = "user/";
	
	@Resource
	private UserService userService;

	@RequestMapping(value = "/list")
	public String list(Model model, HttpServletRequest request,
			HttpServletResponse response) {		
		List<User> list = userService.findAll();
		for (User user : list) {
			logger.info(user.toString());
		}
		model.addAttribute("list", list);
		return viewModel + "list";
	}
}
