package com.kh.spring15;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test03 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {
		int bookId = 2;
		
 BookDto bookDto = sqlsession.selectOne("book.selectOne", bookId);
		log.debug("상세조회 ={}", bookDto);


	}
}
