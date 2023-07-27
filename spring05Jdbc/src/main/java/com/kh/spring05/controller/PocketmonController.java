package com.kh.spring05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring05.dao.PocketmonDAO;
import com.kh.spring05.dto.PocketmonDTO;

@RestController//등록하고 
public class PocketmonController {
@Autowired//필요 한거 주세요
private PocketmonDAO dao;
@RequestMapping("/insert")
public String insert(@ModelAttribute PocketmonDTO dto) {
	dao.insert(dto);
	return "포켓몬 등록 완료!";
}
@RequestMapping("/update")
public String update(@ModelAttribute PocketmonDTO dto) {
	boolean result = dao.update(dto);
	if (result ==true)
	return " 포켓몬 업데이트 완료!";
	else {
		return " 해당번호는 존재 하지 않습니다";
	}
}
@RequestMapping("/delete")
public String delete(@RequestParam int no) {
	boolean result = dao.delete(no);
	if(result)  return "삭제 완료";
	else return "존재하지 않는 몬스터 번호입니다";
	
}
}
