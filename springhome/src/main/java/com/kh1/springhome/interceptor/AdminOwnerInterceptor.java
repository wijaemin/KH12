package com.kh1.springhome.interceptor;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.kh1.springhome.dao.AdminDao;
import com.kh1.springhome.dto.MemberDto;
import com.kh1.springhome.error.NoTargetException;


/**
 관리자외 접근을 차단하는 인터셉터
 */

@Component
public class AdminOwnerInterceptor implements HandlerInterceptor {
@Autowired 
AdminDao adminDao;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//HttpSession에 있는 level 항목이 관리자인지 확인하여 통과 또는 차단
		HttpSession session = request.getSession();
		String memberLevel =(String) session.getAttribute("level");

		//(주의) 자바는 null을 반드시 먼저 검사 해야 한다.
		boolean isAdmin =memberLevel !=null && memberLevel.equals("관리자");
		
		if(isAdmin) { //관리자라면 
			return true; //통과
		}
		else { //관리자가 아니라면(VIP,일반, 비회원)
				throw new AuthenticationException("권한에 맞지 않음"); //차단
		}
	
	}
}
