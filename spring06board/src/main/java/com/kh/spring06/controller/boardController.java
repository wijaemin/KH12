package com.kh.spring06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06.dao.boardDAO;
import com.kh.spring06.dto.boardDTO;

@RestController
public class boardController {
	@Autowired
private 	boardDAO dao;
@RequestMapping("/insert")
public String insert(@ModelAttribute  boardDTO dto) {
	dao.insert(dto);
	return "보드 등록 완료";
}
@RequestMapping("/update")
public String update(@ModelAttribute boardDTO dto) {
	boolean a = dao.update(dto);
	if(a)
	return "보드 업데이트 완료";
	else return "보드의 고유번호를 다시 입력해주세요";
}
}
