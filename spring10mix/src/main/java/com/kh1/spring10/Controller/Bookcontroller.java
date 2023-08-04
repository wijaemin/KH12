package com.kh1.spring10.Controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/book/insert.jsp";
	}
	@PostMapping("/insert")
	public String insert(@ModelAttribute BookDTO dto) {
		dao.save(dto);
		return "redirect:list";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int bookID) {
		boolean result = dao.delete(bookID);
		if(result) {
			return "redirect:list";
		}
		else {
			return "redirect:에러페이지";
		}
	}
	@GetMapping("/edit")
	public String edit(Model model,@RequestParam int bookID) {
		BookDTO dto= dao.detail(bookID);
		model.addAttribute("dto",dto);
		return "/WEB-INF/views/book/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute BookDTO dto) {
		boolean result = dao.update(dto);
		if(result) { 
			return "redirect:./detail?no="+dto.getBookID();
		}
		else {
			return "몰라";
		}
	}
}
