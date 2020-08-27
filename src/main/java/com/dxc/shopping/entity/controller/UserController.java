package com.dxc.shopping.entity.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dxc.shopping.entity.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	public Logger logger=Logger.getLogger(UserController.class.getName());

	
	@RequestMapping("/")
	public String showIndexPage() {
		logger.info("=========showIndexPage()called==============");
		return "index";
	}
	
}
