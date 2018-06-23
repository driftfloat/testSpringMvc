package com.fallwater.testSpringMvc.dao;

import java.util.List;

import com.fallwater.testSpringMvc.entity.Message;



public interface MessageMapper {
    int deleteByPrimaryKey(Integer messageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer messageId);

    int updateByPrimaryKeySelective(Message record);
    
    List<Message> userMessages(int userId);
    
}