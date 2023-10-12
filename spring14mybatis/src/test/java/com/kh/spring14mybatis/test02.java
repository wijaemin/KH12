package com.kh.spring14mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14mybatis.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
public class test02 {
	@Autowired
	SqlSession sqlsession;
	@Test
	public void test() {
		//구문에 필요한 값이 있다면 만들어서 전달하며 불러야한다.
		int no =1;
		PocketmonDto dto =sqlsession.selectOne("pocketmon.find",no);
		log.debug("dto={}",dto);
	}

}
