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
//		param.put("bookPriceMax", 200);
//		param.put("bookPublicationBegin", "1992-10-26");
//		param.put("bookPublicationEnd", "2023-01-01");
//		param.put("bookPageMin", 10);
//		param.put("bookPageMax", 300);
//		param.put("bookGenreList", "판타지"); //장르가 1개 라면..(X)
//		param.put("bookGenreList", List.of("판타지"));
//		param.put("bookGenreList", List.of("판타지","공포","코메디")); //장르가 여러개 라면..(O)
//		param.put("orderList", List.of("book_id asc"));//번호순
		param.put("orderList", List.of("book_publication_date asc", "book_id asc"));
		//최근 출간순 그리고 이후 번호 순
		param.put("begin", 1);
		param.put("end", 10);
		List<BookDto> list = sqlsession.selectList("book.complexSearch", param);
		log.debug("검색결과= {}", list.size());
		for(BookDto dto : list) {
			log.debug("dto={}",dto);
		}
	}
}
