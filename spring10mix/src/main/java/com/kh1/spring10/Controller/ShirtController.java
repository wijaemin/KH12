package com.kh1.spring10.Controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh1.spring10.dao.ShirtDao;
import com.kh1.spring10.dto.ShirtDto;

@Controller
@RequestMapping("/shirt")

public class ShirtController {
	@Autowired
	ShirtDao dao;

	@GetMapping("/add")
	public String add() {
		return "/WEB-INF/views/shirt/add.jsp";
	}

	@PostMapping("/add")
	public String add(@ModelAttribute ShirtDto dto) {
		int shirt_no = dao.sequence();
		dto.setShirt_no(shirt_no);
		dao.add(dto);
		return "redirect:list";
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<ShirtDto> list = dao.list();
		model.addAttribute("list", list);
		return "/WEB-INF/views/shirt/list.jsp";
	}

	@RequestMapping("/detail")
	public String detail(@RequestParam int shirt_no, Model model) {
		ShirtDto dto = dao.detail(shirt_no);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/shirt/detail.jsp";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int shirt_no) {
		boolean result = dao.delete(shirt_no);
		if (result) {
			return "redirect:list";
		} else {
			return "redirect:에러 페이지";
		}
	}

	@GetMapping("/edit")
	public String edit(Model model, int shirt_no) {
		ShirtDto dto = dao.detail(shirt_no);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/shirt/edit.jsp";
	}

	@PostMapping("/edit")
	public String edit(@ModelAttribute ShirtDto dto) {
		Boolean result = dao.edit(dto);
		if (result) {
			return "redirect:detail?shirt_no=" + dto.getShirt_no();
		}
		else return "redirect:에러 페이지";
	}
}
