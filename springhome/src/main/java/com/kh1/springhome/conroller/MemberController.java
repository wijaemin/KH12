package com.kh1.springhome.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh1.springhome.dao.MemberDao;
import com.kh1.springhome.dao.MemberDaoImpl;
import com.kh1.springhome.dto.MemberDto;

@Controller
@RequestMapping("/member")
public class MemberController {
	//@Autowired는 지정한 클래스 및 자식클래스 중 등록된것을 찾아 주입한다.
@Autowired MemberDao memberDao;
	
	@RequestMapping("/insert")
	public String insert(MemberDto memberDto) {
		memberDao.insert(memberDto);
		return "/WEB-INF/views/member/insert.jsp";
	}
}
