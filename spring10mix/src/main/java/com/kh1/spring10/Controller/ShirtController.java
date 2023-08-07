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

import com.kh1.spring10.dao.ShirtDao;
import com.kh1.spring10.dao.ShirtSizeDao;
import com.kh1.spring10.dto.ShirtDto;
import com.kh1.spring10.dto.ShirtSizeDto;

@Controller
@RequestMapping("/shirt")

public class ShirtController {
	@Autowired
	ShirtDao dao;

	@Autowired
	ShirtSizeDao sizeDao;
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
	
	//(추가) 만약 사이즈까지 같이 등록하는 거라면...
	@GetMapping("/add2")
	public String add2() {
		return "/WEB-INF/views/shirt/add2.jsp";
	}
	@PostMapping("/add2")
	public String add2(@ModelAttribute ShirtDto shirtDto,
			@RequestParam List<String> size) {
		int shirt_no = dao.sequence();
		shirtDto.setShirt_no(shirt_no);
		dao.add(shirtDto);
		
		for(String s :size) {
			ShirtSizeDto sizeDto = new ShirtSizeDto();
			sizeDto.setShirt_no(shirt_no);
			sizeDto.setShirt_size_name(s);
			sizeDao.insert(sizeDto);
		}
		return "redirect:detail?shirt_no="+shirt_no;
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
