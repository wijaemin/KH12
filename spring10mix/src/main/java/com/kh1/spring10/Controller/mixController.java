package com.kh1.spring10.Controller;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh1.spring10.dto.PocketmonDto;

@Controller
public class mixController {
//목표 : 컨트롤러에서 계산한 값을 JSP에서 출력
	// -전달하는 매개체가 필요
	// -Model을 매개변수에 선언하면 자동으로 사용할수있도록 스프링이 제공
	// -선언한 모델에 key=value형태로 데이터에 제공하면 JSP로 넘어감

	@RequestMapping("/test01")
	public String test01(Model model) {
		// 계산 코드(비즈니스 로직)
		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		// Model에 추가
		// JSP에서 dice라는 이름으로 사용할수있도록 값을 전달한다
		model.addAttribute("dice", dice);
		return "/WEB-INF/views/test01.jsp";
	}

	@RequestMapping("/test02")
	public String test02(Model model, @RequestParam int birth) {
		LocalDate.now();
		int age = 2023 - birth + 1;
		int price;
		if (age >= 65 || age < 8)
			price = 0;
		else if (age >= 20) {
			price = 1250;
		} else if (age >= 14) {
			price = 720;
		} else {
			price = 450;
		}

		model.addAttribute("age", age);
		model.addAttribute("price", price);
		return "/WEB-INF/views/test02.jsp";
	}

	@RequestMapping("/test03")
	public String test03(Model model) {
		PocketmonDto dto = new PocketmonDto();
		dto.setNo(1);
		dto.setName("피카츄");
		dto.setType("전기");

		model.addAttribute("dto", dto);

		return "/WEB-INF/views/test03.jsp";
	}
}
