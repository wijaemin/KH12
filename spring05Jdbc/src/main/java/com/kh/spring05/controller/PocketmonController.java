package com.kh.spring05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
