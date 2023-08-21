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

@Component
public class AdminOwnerInterceptor implements HandlerInterceptor {
@Autowired 
AdminDao adminDao;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		String memberLevel =(String) session.getAttribute("level");
		String memberId =(String) session.getAttribute("name");
		MemberDto memberDto = adminDao.detail(memberId);
		if(memberLevel.equals("관리자")) {
			return true;
		}
		else {
				throw new AuthenticationException("권한에 맞지 않음");
		}
	
	}
}
