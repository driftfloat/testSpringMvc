package com.fallwater.testSpringMvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fallwater.testSpringMvc.dao.AnswerMapper;
import com.fallwater.testSpringMvc.dao.QuestionMapper;
import com.fallwater.testSpringMvc.entity.Answer;
import com.fallwater.testSpringMvc.entity.Question;
import com.fallwater.testSpringMvc.service.AnswerService;

/*  Author: kevin
 *	Date: 2018年6月23日
**/
@Service
public class AnswerServiceImpl implements AnswerService {
	@Resource
	private AnswerMapper answerMapper;
	
	@Override
	public int add(Answer record) {
		return answerMapper.insertSelective(record);
	}

	@Override
	public Answer get(int id) {
		return answerMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(Answer answer) {
		return answerMapper.updateByPrimaryKeySelective(answer);
	}

	@Override
	public List<Answer> list(int questionId) {
		return answerMapper.list(questionId);
	}

}
