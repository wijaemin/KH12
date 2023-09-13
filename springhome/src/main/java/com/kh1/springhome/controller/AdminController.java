package com.kh1.springhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh1.springhome.dao.AdminDao;
import com.kh1.springhome.dao.BoardDao;
import com.kh1.springhome.dao.MemberDao;
import com.kh1.springhome.dto.BoardListDto;
import com.kh1.springhome.dto.MemberDto;
import com.kh1.springhome.dto.MemberListDto;
import com.kh1.springhome.error.NoTargetException;
import com.kh1.springhome.vo.PaginationVO;




@Controller
@RequestMapping("/admin")
public class AdminController {
@Autowired
AdminDao adminDao;
@Autowired
MemberDao memberDao;
@Autowired
BoardDao boardDao;

	@RequestMapping("/home")
	public String home()
	{return "/WEB-INF/views/admin/home.jsp";
		
	}	
	
	@RequestMapping("/member/list")
	public String memberList(@ModelAttribute PaginationVO vo, Model model) {
		int count = adminDao.countList(vo);
		vo.setCount(count);
		model.addAttribute("vo", vo);
		
	//	List<MemberDto> list = adminDao.selectListByPage(vo);
		List<MemberListDto> list = adminDao.selectListByPage2(vo);
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/admin/member/list.jsp";
	}
	@RequestMapping("/member/memberDetail")
	public String memberDetail(@RequestParam String memberId, Model model) {
		//파라미터로 전달된 아이디의 회원정보를 조회하여 모델에 첨부
		MemberDto memberDto = memberDao.selectOne(memberId);
		model.addAttribute("memberDto",memberDto);
		
		//이 회원이 작성한 글을 조회하여 모델에 첨부
		List<BoardListDto>boardList = boardDao.selectListByBoardWriter(memberId);
		model.addAttribute("boardList",boardList);
		return "/WEB-INF/views/admin/member/detail.jsp";
	}
	@GetMapping("/member/edit")
	public String memberEdit(Model model,@RequestParam String memberId) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		model.addAttribute("memberDto",memberDto);
		return "/WEB-INF/views/admin/member/edit.jsp";
	}
	
	@PostMapping("/member/edit")
	public String memberEdit(@ModelAttribute MemberDto memberDto) {
		boolean result = memberDao.updateMemberInfoByAdmin(memberDto);
		if(result) {
		return "redirect:list";} //상대경로
	//	return "redirect:/admin/member/list";} //상대경로
		else {
			throw new NoTargetException("존재하지 않는 회원ID");
		}
	}
	
	@RequestMapping("/member/block")
	public String memberBlock(@RequestParam String memberId) {
		adminDao.insertBlock(memberId);
		return "redirect:list?size=20";
	}
	@RequestMapping("/member/cancel")
	public String memberCancel(@RequestParam String memberId) {
		adminDao.deleteBlock(memberId);
		return "redirect:list?size=20";
	}


}