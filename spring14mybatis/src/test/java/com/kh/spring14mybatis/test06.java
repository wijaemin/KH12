package com.kh.spring14mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14mybatis.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class test06 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {
		Map<String, Object> param = new HashMap<>();
		param.put("type", "name");
		param.put("keyword", "피카");
		List<PocketmonDto> list = sqlsession.selectList("pocketmon.complex1", param);
		log.debug("결과={}", list.size());
		for (PocketmonDto dto : list) {
			log.debug("dto={}", dto);
		}

	}
}
