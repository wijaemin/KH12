package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test05 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {
		int bookNo = 1;
		int count = sqlsession.delete("book.remove", bookNo);
		boolean result = count > 0;
		log.debug("삭제 결과 ={}", result);

	}
}
