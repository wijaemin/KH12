package com.kh.spring15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;
import com.kh.spring15.dto.SerachDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test06 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {
//		SerachDto serachDto = new SerachDto();
//		String keyword = "황";
//		String type = "book_title";
//		serachDto.setKeyword(keyword);
//		serachDto.setType(type);
//
//		List<BookDto> list = sqlsession.selectList("book.search", serachDto);
//		log.debug("목록의 갯수={}", list.size());
//		for (BookDto dto : list) {
//			log.debug("목록={}", dto);
//		}
		Map<String, Object> param = new HashMap<>();
		param.put("type", "book_title");
		param.put("keyword","황");
		List<BookDto> list = sqlsession.selectList("book.search", param);
		log.debug("목록의 갯수={}", list.size());
		for (BookDto dto : list) {
			log.debug("목록={}", dto);
		}
		
	}
}
