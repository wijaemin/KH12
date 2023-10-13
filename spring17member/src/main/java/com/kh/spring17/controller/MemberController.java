package com.kh.spring17.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring17.dao.MemberDao;
import com.kh.spring17.vo.MemberVo;

@Controller
@RequestMapping("member")
public class MemberController {

	@Autowired
private	MemberDao memberDao;
	@RequestMapping("list")
	public String list(@ModelAttribute("vo") MemberVo vo, Model model) {
		model.addAttribute("list",memberDao.listSerach(vo));
		return "/WEB-INF/views/member/memberList.jsp";
		
	}
}
