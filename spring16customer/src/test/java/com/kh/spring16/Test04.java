package com.kh.spring16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class Test04 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {
		int costomerNo = 1;
		CustomerDto dto = sqlsession.selectOne("costomer.selectOne", costomerNo);
		log.debug("상세목록={}", dto);
	}
}
