package com.kh1.spring09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/form") //공용 주소
public class FormController {

	@RequestMapping("/test01")
	public String test01() {
		return "/WEB-INF/views/form/test01.jsp";
	}
	@RequestMapping("/test02")
	public String test02() {
		return "/WEB-INF/views/form/test02.jsp";
	}
	
}
