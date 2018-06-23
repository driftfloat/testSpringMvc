package com.fallwater.testSpringMvc.service;

import java.util.List;

import com.fallwater.testSpringMvc.entity.Question;

/*  Author: kevin
 *	Date: 2018年6月23日
**/
public interface QuestionService {
	int add(Question record);
	Question get(int id);
	int update(Question question);
	List<Question> list();
}
