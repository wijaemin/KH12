package com.kh1.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

// 회원인지 아닌지  검사하여 비회원을 차단하는 인터셉터 구현
@Component
public class MemberInterceptor implements HandlerInterceptor{
	
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
	System.out.println("MemberInterceptor 실행");
	return true;
}
}
