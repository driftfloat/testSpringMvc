package com.fallwater.testSpringMvc.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fallwater.testSpringMvc.dao.QuestionMapper;
import com.fallwater.testSpringMvc.entity.Question;
import com.fallwater.testSpringMvc.service.QuestionService;

/*  Author: kevin
 *	Date: 2018年6月23日
**/
@Service
public class QuestionServiceImpl implements QuestionService {
	@Resource
	private QuestionMapper questionMapper;
	
	@Override
	public int add(Question record) {
		record.setCreateTime(new Date().getTime()); 
		return questionMapper.insertSelective(record);
	}

	@Override
	public Question get(int id) {
		return questionMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(Question question) {
		return questionMapper.updateByPrimaryKeySelective(question);
	}

	@Override
	public List<Question> list() {
		return questionMapper.list();
	}

}
