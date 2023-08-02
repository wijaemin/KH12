package com.kh1.spring10.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh1.spring10.dao.boardDAO;
import com.kh1.spring10.dto.boardDTO;

@Controller
@RequestMapping("/board")
public class boardController {
	@Autowired
	boardDAO dao;

	@RequestMapping("/detail")
	public String test04(Model model, int no) {

		boardDTO dto = dao.selectOne(no);

		model.addAttribute("dto", dto);

		return "/WEB-INF/views/board/test01.jsp";
	}
}
