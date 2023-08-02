package com.kh1.spring10.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh1.spring10.dao.boardDAO;
import com.kh1.spring10.dto.BookDTO;
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

		return "/WEB-INF/views/board/detail.jsp";
	}
	@RequestMapping("/list")
	public String list(Model model) {
		List<boardDTO> list = dao.List();
		model.addAttribute("list",list);
		return  "/WEB-INF/views/board/list.jsp";
		
	}
}
