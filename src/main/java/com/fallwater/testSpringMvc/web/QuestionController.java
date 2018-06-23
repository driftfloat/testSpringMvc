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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fallwater.testSpringMvc.entity.Question;
import com.fallwater.testSpringMvc.entity.User;
import com.fallwater.testSpringMvc.service.QuestionService;

@Controller
@RequestMapping("/question")
public class QuestionController {
	private static Logger logger = LoggerFactory.getLogger(QuestionController.class);
    
	@Resource
	private QuestionService questionService;
	
	@RequestMapping("/toAdd")
    public String toAdd(final HttpServletRequest request,
            final HttpServletResponse response)
    {
        return "question/add";
    }
	
	@RequestMapping("/add")
	@ResponseBody
    public String add(Question question ,final HttpServletRequest request,
            final HttpServletResponse response)
    {
		User currentUser = (User) request.getSession().getAttribute("user");
		question.setUserId(currentUser.getId());
		int rtn = questionService.add(question);
		 return rtn>0?"1":"0";
    }
	
	@RequestMapping("/list")
    public String list(final HttpServletRequest request,
            final HttpServletResponse response, HashMap<String,Object> model)
    {
		List<Question> list = questionService.list();
		model.put("questions", list);
        return "question/questionlist";
    }
	
}
