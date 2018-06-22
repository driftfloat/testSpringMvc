package com.fallwater.testSpringMvc.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fallwater.testSpringMvc.entity.User;
import com.fallwater.testSpringMvc.service.UserService;

@Controller
@RequestMapping("/")
public class UserController
{
	@Resource 
	private UserService userService;

    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    
    @RequestMapping("/toLogin")
    public String toLogin(final HttpServletRequest request,
            final HttpServletResponse response)
    {
        return "login";
    }
    
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
    	if(userService.login(user)>0) {
    		User condition = new User();
    		condition.setUsername(user.getUsername());
    		user = userService.query(condition);
    		request.getSession().setAttribute("user", user);
    		return "redirect:/web/index";
    	}
    	return "login";
    }
    
    @RequestMapping("/toRegister")
    public String toRegister(User user) {
    	return "register";
    }
    
    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(User user) {
    	if(userService.addUser(user)) {
    		return "1";
    	}
    	return "0";
    }

}

