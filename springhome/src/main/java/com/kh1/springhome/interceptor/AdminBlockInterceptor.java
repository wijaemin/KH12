package com.kh1.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh1.springhome.dto.MemberListDto;

@Component
public class AdminBlockInterceptor implements HandlerInterceptor{
	
	@Autowired
	MemberListDto memberListDto;
	
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
	HttpSession session = request.getSession();
	
	boolean isBlock=  memberListDto.getBlock()=="Y"; 
	if(isBlock) {
		return true;
	}
	else {return false;}
}
}
