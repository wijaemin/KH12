package com.kh.spring18.controller;

import java.io.IOException;
import java.security.Provider.Service;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring18.dao.SecureMemberDao;
import com.kh.spring18.dto.SecureMemberDto;
import com.kh.spring18.service.EmailService;

@Controller
@RequestMapping("/secure")
public class SecureMemberController {

	@Autowired
private	SecureMemberDao secureMemberDao;
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/join")
	public String join() {
	//	return "/WEB-INF/views/secure/join.jsp";
		return "secure/join";
	}
	
	
	@PostMapping("/join")
	public String join(@ModelAttribute SecureMemberDto dto) throws MessagingException, IOException {
		secureMemberDao.insert(dto);
		
		emailService.sendCelebration(dto.getMemberId());

		return "redirect:joinFinish";
	}
	
	@RequestMapping("/joinFinish")
	public String joinFinish() {
		//return "/WEB-INF/views/secure/joinFinish.jsp";
		return "secure/joinFinish";
	}
	@GetMapping("/login")
	public String login() {
		//return "/WEB-INF/views/secure/login.jsp";
		return "secure/login";
	}
	@PostMapping("/login")
	public String login(HttpSession session, @ModelAttribute SecureMemberDto dto) {
		SecureMemberDto target = secureMemberDao.login(dto);
		if(target == null) { return "redirect:login?error";}
		else {
			//세선정보 설정.. 후 메인페이지 혹은 기존페이지 이동
			session.setAttribute("memberId", target.getMemberId());
			session.setAttribute("memberPw", target.getMemberPw());
			return  "redirect:login?success";
		}
		
	
	}
}
