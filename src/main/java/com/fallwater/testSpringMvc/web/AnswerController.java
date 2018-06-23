package com.fallwater.testSpringMvc.web;
/*  Author: kevin
 *	Date: 2018年6月23日
**/

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fallwater.testSpringMvc.entity.Answer;
import com.fallwater.testSpringMvc.entity.Question;
import com.fallwater.testSpringMvc.entity.User;
import com.fallwater.testSpringMvc.service.AnswerService;
import com.fallwater.testSpringMvc.service.QuestionService;

@Controller
@RequestMapping("/answer")
public class AnswerController {
	private static Logger logger = LoggerFactory.getLogger(AnswerController.class);
    
	@Resource
	private AnswerService answerService;
	
	@Resource
	private QuestionService questionService;
	
	@RequestMapping("/toAdd")
    public String toAdd(int questionId,HashMap<String,Object> model,final HttpServletRequest request,
            final HttpServletResponse response)
    {
		model.put("questionId", questionId);
        return "answer/add";
    }
	
	@RequestMapping("/add")
	@ResponseBody
    public String add(Answer answer ,final HttpServletRequest request,
            final HttpServletResponse response)
    {
		User currentUser = (User) request.getSession().getAttribute("user");
		answer.setUserId(currentUser.getId());
		int rtn = answerService.add(answer);
		 return rtn>0?"1":"0";
    }
	
	@RequestMapping("/list")
    public String list(int questionId,final HttpServletRequest request,
            final HttpServletResponse response, HashMap<String,Object> model)
    {
		List<Answer> list = answerService.list(questionId);
		model.put("questionId", questionId);
		model.put("answers", list);
        return "answer/answerlist";
    }
	
}
