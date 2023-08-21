package com.kh1.springhome.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh1.springhome.dao.AdminDao;
import com.kh1.springhome.dao.MemberDao;
import com.kh1.springhome.dto.MemberDto;
import com.kh1.springhome.vo.PaginationVO;




@Controller
@RequestMapping("/admin")
public class AdminController {
@Autowired
AdminDao adminDao;
@Autowired
MemberDao memberDao;

	@RequestMapping("/home")
	public String home()
	{return "/WEB-INF/views/admin/home.jsp";
		
	}	
	
	@RequestMapping("/member/list")
	public String memberList(@ModelAttribute PaginationVO vo, Model model) {
		int count = adminDao.countList(vo);
		vo.setCount(count);
		model.addAttribute("vo", vo);
		
		List<MemberDto> list = adminDao.selectListByPage(vo);
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/admin/member/list.jsp";
	}
	@RequestMapping("/member/memberDetail")
	public String memberDetail(@RequestParam String memberId, Model model) {
		MemberDto memberDto = adminDao.detail(memberId);
		model.addAttribute("memberDto",memberDto);
		
		return "/WEB-INF/views/admin/memberDetail.jsp";
	}
	
}
