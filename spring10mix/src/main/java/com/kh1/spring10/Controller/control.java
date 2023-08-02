package com.kh1.spring10.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh1.spring10.dao.MemberDAO;
import com.kh1.spring10.dto.MemberDTO;

@Controller
@RequestMapping("/member1")
public class control {
	@Autowired
	MemberDAO dao;

	@RequestMapping("/detail")
	public String detail(Model model, String memberId) {

		MemberDTO dto = dao.selectOne(memberId);

		model.addAttribute("dto", dto);
		return "/WEB-INF/views/member/test01.jsp";
	}
}
