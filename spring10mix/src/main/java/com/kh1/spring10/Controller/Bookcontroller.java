package com.kh1.spring10.Controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.kh1.spring10.dao.BookDAO;
import com.kh1.spring10.dto.BookDTO;

@Controller
@RequestMapping("/book")
public class Bookcontroller {
	@Autowired
	BookDAO dao;

	@RequestMapping("/detail")
	public String test01(Model model, @RequestParam int no) {
		BookDTO dto = dao.detail(no);

		model.addAttribute("dto", dto);
		
		return "/WEB-INF/views/book/test01.jsp";
	}
}
