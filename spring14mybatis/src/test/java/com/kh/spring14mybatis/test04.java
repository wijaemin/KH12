package com.kh.spring14mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14mybatis.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class test04 {

	@Autowired
	SqlSession sqlsession;
	
	@Test
	public void test() {
		PocketmonDto dto = new PocketmonDto();
		String name="황민하";
		String type="황민하";
		int no = 21;
		dto.setName(name);
		dto.setNo(no);
		dto.setType(type);
		
	int count =	sqlsession.update("pocketmon.edit",dto);
	boolean result = count >0;
	log.debug("result ={}", result);
	}
}
