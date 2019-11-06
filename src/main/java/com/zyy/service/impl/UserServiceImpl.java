package com.zyy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zyy.dao.UserMapper;
import com.zyy.domain.User;
import com.zyy.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserMapper mapper;

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return mapper.list();
	}
	
}
