package com.kh1.spring11.controller;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//CORS를 헤제하기 위한설정(Annotation)
//@@CrossOrigin//전부다 허용(보안상 위험!)
@CrossOrigin(origins = { "http://192.168.30.63:5500" })
@RestController // @Controller + @Repository
public class dummyRestController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello spring ajax";
	}

	// RestController 에서는 내가 전해줄 데이터가 반환형이 된다.
	// 자동으로 Spring에서 JSON형태로 변환하여 반환
	// 변환을 담당하는 라이브러리는 jackson-databind
	@RequestMapping("/lotto")
	public Set<Integer> lotto() {
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();
		while (set.size() < 6) {
			int n = r.nextInt(45) + 1;
			set.add(n);
		}
		return set;
	}
}
