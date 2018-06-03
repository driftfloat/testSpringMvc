package com.fallwater.testSpringMvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if(request.getSession().getAttribute("user")!=null) {
			return true;
		}
		if(request.getRequestURI().contains("login")) {
			return true;
		}
		if(request.getRequestURI().contains("toLogin")) {
			return true;
		}
		
		response.sendRedirect(request.getContextPath()+"/web/toLogin.html");
        return false;
	}
}
