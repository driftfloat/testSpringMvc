package com.fallwater.testSpringMvc.web;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fallwater.testSpringMvc.entity.Message;
import com.fallwater.testSpringMvc.entity.User;
import com.fallwater.testSpringMvc.service.MessageService;

@Controller
@RequestMapping("/message")
public class MessageController
{
    private static Logger logger = LoggerFactory.getLogger(MessageController.class);
    
    @Resource
    private MessageService messageService;
    
    @RequestMapping("/toSend")
    public String index()
    {
        return "send";
    }
    
    @RequestMapping("/send")
    @ResponseBody
    public String toSend(Message message,final HttpServletRequest request)
    {
    	User currentUser = (User) request.getSession().getAttribute("user");
    	int rtn = messageService.sendMessage(currentUser,  message);
        return rtn>0?"1":"0";
    }
    
    @RequestMapping("/list")
    public String list(final HttpServletRequest request, HashMap model)
    {
    	User currentUser = (User) request.getSession().getAttribute("user");
    	List<Message> userMessages = messageService.userMessages(currentUser.getId());
    	model.put("userMessages", userMessages) ;
        return "userMessages";
    }
}

