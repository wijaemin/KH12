package com.kh.spring14mybatis;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class test05 {

	@Autowired
	SqlSession sqlsession;
	@Test
	public void test() {
		int no = 21;
	int count =	sqlsession.delete("pocketmon.del",no);
	boolean result = count >0;
	log.debug("결과는?={}",result);
		
	}
}
