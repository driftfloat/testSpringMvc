package com.fallwater.testSpringMvc.service;

import com.fallwater.testSpringMvc.entity.User;

/*  Author: kevin
 *	Date: 2018年6月2日
**/

public interface UserService {
	boolean addUser(User user);
	User getUser(int id);
}
