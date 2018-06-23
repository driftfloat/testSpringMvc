package com.fallwater.testSpringMvc.service;

import java.util.List;

import com.fallwater.testSpringMvc.entity.Answer;
import com.fallwater.testSpringMvc.entity.Question;

/*  Author: kevin
 *	Date: 2018年6月23日
**/
public interface AnswerService {
	int add(Answer record);
	Answer get(int id);
	int update(Answer answer);
	List<Answer> list(int questionId);
}
