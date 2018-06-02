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
public class IndexController
{
	@Resource 
	private UserService userService;

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

//    @Resource
//	private UserAuthorityService userAuthorityService;
    
    @RequestMapping("/index")
    public String index(final HttpServletRequest request,
            final HttpServletResponse response)
    {
        return "index";
    }
    
    @RequestMapping("/registerPage")
    public String registerPage(User user) {
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

//    @RequestMapping("/top")
//    public String top(final HttpServletRequest request,
//            final HttpServletResponse response)
//    {
//        return "top";
//    }

//    @RequestMapping("/left")
//    public ModelAndView left(final HttpServletRequest request,HttpSession session,
//            final HttpServletResponse response)
//    {
//    	User u=(User)session.getAttribute("loginUser");
//    	List<UserAuthority> list= userAuthorityService.queryUserAuthority(u.getUserType());    	
//    	ModelAndView v =new ModelAndView();    	
//    	v.setViewName("left");
//    	v.addObject("list", list);
//        return v;
//    }

//    @RequestMapping("/footer")
//    public String footer(final HttpServletRequest request,
//            final HttpServletResponse response)
//    {
//        return "footer";
//    }

}

