package com.kh.spring03.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 어노테이션(Annotation) -역할 정의
public class QuizController {
	@RequestMapping("/dice")
	public String quiz() {
		Random r = new Random();
		int dice = r.nextInt(6) + 1;
		// System.out.println(dice);//의미없음 사용자한테 안보임
		return "랜덤 주사위 값은 ? " + dice;
	}

	@RequestMapping("/lotto")
	public String lotto() {
		Random r = new Random();
		int lotto = r.nextInt(45) + 1;
		return "로또 번호는 " + lotto;

	}
}
