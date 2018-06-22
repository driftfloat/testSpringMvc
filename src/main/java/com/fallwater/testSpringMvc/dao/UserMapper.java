package com.fallwater.testSpringMvc.dao;

import com.fallwater.testSpringMvc.entity.User;

public interface UserMapper {
	int login(User user);
	
	User query(User user);
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    
}