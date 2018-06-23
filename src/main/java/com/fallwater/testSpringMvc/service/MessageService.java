package com.fallwater.testSpringMvc.service;

import java.util.List;

import com.fallwater.testSpringMvc.entity.Message;
import com.fallwater.testSpringMvc.entity.User;

/*  Author: kevin
 *	Date: 2018年6月17日
**/
public interface MessageService {
	int sendMessage(User fromUser,Message message);
	List<Message> userMessages(int userId);
}
