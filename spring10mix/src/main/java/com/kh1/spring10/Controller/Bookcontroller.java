package com.kh1.spring10.Controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.kh1.spring10.dao.BookDAO;
import com.kh1.spring10.dto.BookDTO;
import com.kh1.spring10.dto.boardDTO;

@Controller
@RequestMapping("/book")
public class Bookcontroller {
	@Autowired
	BookDAO dao;

	@RequestMapping("/detail")
	public String detail(Model model, @RequestParam int no) {
		BookDTO dto = dao.detail(no);

		model.addAttribute("dto", dto);
		
		return "/WEB-INF/views/book/detail.jsp";
	}
	@RequestMapping("/list")
	public String list(Model model) {
		List<BookDTO> list = dao.list();
		model.addAttribute("list",list);
		return  "/WEB-INF/views/book/list.jsp";
		
	}
}
