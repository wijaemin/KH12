package com.kh.spring15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test07 {

	@Autowired
	SqlSession sqlsession;
	
	@Test
	public void test() {
		Map<String, Object> param = new HashMap<>();
//		param.put("bookId", 3);
//		param.put("bookTitle","황민하");
//		param.put("bookAuthor", "황");
//		param.put("bookPublisher", "출판사");
//		param.put("bookPriceMin", 100);
		param.put("bookPriceMax", 200);
		List<BookDto> list = sqlsession.selectList("book.complexSearch", param);
		log.debug("검색결과= {}", list.size());
		for(BookDto dto : list) {
			log.debug("dto={}",dto);
		}
	}
}
