package com.kh.spring14mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14mybatis.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
public class test03 {
	@Autowired
	SqlSession sqlsession;
	@Test
	public void test() {
		// 주의= mybatis 구문을 호출할때는 구문 옆에 단 한개의 데이터만 호출할수 있다.
		PocketmonDto dto = new PocketmonDto();
		dto.setName("테스트");
		dto.setType("테스트");
		sqlsession.insert("pocketmon.add",dto);
	}

}
