package com.fallwater.testSpringMvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fallwater.testSpringMvc.dao.UserMapper;
import com.fallwater.testSpringMvc.entity.User;
import com.fallwater.testSpringMvc.service.UserService;

/*  Author: kevin
 *	Date: 2018年6月2日
**/

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	
	@Override
	public boolean addUser(User user) {
		user.setStatus("1");
		if( userMapper.insertSelective(user)>0) {
			return true;
		}
		return false;
	}

	@Override
	public User getUser(int id) {	
		return userMapper.selectByPrimaryKey(id);
	}

}
