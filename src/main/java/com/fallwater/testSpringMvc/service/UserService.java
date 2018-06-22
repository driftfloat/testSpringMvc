package com.fallwater.testSpringMvc.service;

import com.fallwater.testSpringMvc.entity.User;

/*  Author: kevin
 *	Date: 2018年6月2日
**/

public interface UserService {
	int login(User user);
	User query(User condition);
	boolean addUser(User user);
	User getUser(int id);
}
