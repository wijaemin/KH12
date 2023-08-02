package com.kh1.spring10.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.kh1.spring10.dto.PocketmonDto;

@Controller
@RequestMapping("/pocketmon")
//포켓몬스터 시스템을 처리하는 컨트롤러
public class PocketmonController {

//	@Autowired
//	PocketmonDao dao;
	
//	@RequestMapping("/detail")
//	public String detail(@RequestParam int no, Model model) {
//		PocketmonDto dto = dao.selectOne(no);
//		model.addAttribute("dto", dto);
//		return "/WEB-INF/views/pocketmon/detail.jsp";
		
	
	//목록
//	@RequestMapping("/list")
//	public String list(Model model) {
//		List<PocketmonDto> list = dao.selectList();
//		model.addAttribute("list", list);
//		return "/WEB-INF/views/pocketmon/list.jsp";
//	}
//	}
}
