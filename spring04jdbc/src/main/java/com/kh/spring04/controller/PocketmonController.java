package com.kh.spring04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocketmonController {

	//JdbcTemplate를 직접 만들수 없다.(스프링이 싫어함)
	//설정을 통해서 스프링에게 생성을 요청했으니
	//스프링에게 사용할수 있도록 "주세요~"라고 한다.
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/insert")
	public String insert(@RequestParam int no,@RequestParam String name,@RequestParam String type) {
		String sql = "insert into pocketmon(no,name,type)"
				+"values (?,?,?)";
		Object[] data = {no,name,type};
		jdbcTemplate.update(sql,data);
		return "등록 완료";
	}
	
}
