package com.fallwater.testSpringMvc.web;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class IndexController
{

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

//    @Resource
//	private UserAuthorityService userAuthorityService;
    
    @RequestMapping("/index")
    public String index(final HttpServletRequest request,
            final HttpServletResponse response)
    {
        return "index";
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
    
    @RequestMapping(value="/add", method=RequestMethod.GET)  
    public String addUser(){  
        return "add";  
    }  
    @RequestMapping(value="/add", method=RequestMethod.POST)  
    public String addUser(@RequestParam MultipartFile myfiles, HttpServletRequest request) throws IOException{  
        //如果只是上传一个文件，则只需要MultipartFile类型接收文件即可，而且无需显式指定@RequestParam注解  
        //如果想上传多个文件，那么这里就要用MultipartFile[]类型来接收文件，并且还要指定@RequestParam注解  
        //并且上传多个文件时，前台表单中的所有<input type="file"/>的name都应该是myfiles，否则参数里的myfiles无法获取到所有上传的文件  
//        for(MultipartFile myfile : myfiles){  
//            if(myfile.isEmpty()){  
                System.out.println("文件未上传");  
//            }else{  
                System.out.println("文件长度: " + myfiles.getSize());  
                System.out.println("文件类型: " + myfiles.getContentType());  
                System.out.println("文件名称: " + myfiles.getName());  
                System.out.println("文件原名: " + myfiles.getOriginalFilename());  
                System.out.println("========================================");  
                //如果用的是Tomcat服务器，则文件会上传到\\%TOMCAT_HOME%\\webapps\\YourWebProject\\WEB-INF\\upload\\文件夹中  
                String realPath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload");  
                //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的  
                FileUtils.copyInputStreamToFile(myfiles.getInputStream(), new File(realPath, myfiles.getOriginalFilename()));  
//            }  
//        }  
//        users.put(user.getUsername(), user);  
        return "redirect:index";  
    }  

}

