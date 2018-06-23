package com.fallwater.testSpringMvc.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fallwater.testSpringMvc.dao.MessageMapper;
import com.fallwater.testSpringMvc.entity.Message;
import com.fallwater.testSpringMvc.entity.User;
import com.fallwater.testSpringMvc.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	@Resource
	private MessageMapper messageMapper;
	
	@Override
	public int sendMessage(User fromUser, Message message) {
		message.setFromUserId(fromUser.getId());
		String datatime = LocalDateTime.now().toString().replace("T", " ").substring(0, 19);
		message.setMessageDate(datatime);
		return messageMapper.insertSelective(message);
	}

	@Override
	public List<Message> userMessages(int userId) {
		return messageMapper.userMessages(userId);
	}

}
