package com.kh.spring03.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
	//질문답변
	@RequestMapping("/lotto-list")
	public List<Integer> lottoList() {
		List<Integer> list = new ArrayList<>();
		for(int i=1; i <= 45;i ++) {
			list.add(i);
		}
		Collections.shuffle(list);
		List<Integer> lotto = list.subList(0, 6);
		Collections.sort(lotto);
		return lotto;
	}
	
}

