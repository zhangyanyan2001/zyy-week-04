package com.zyy.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zyy.domain.User;
import com.zyy.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService service;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request) {
		
		List<User> list = service.list();
		
		request.setAttribute("list", list);
		
		return null;
	}
}
