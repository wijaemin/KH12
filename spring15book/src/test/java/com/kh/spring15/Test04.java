package com.kh.spring15;



import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {
		int bookId = 2;
		String bookAuthor= "문주현";
		String bookTitle="문주현연대기";
		String bookPublicationDate ="1992-10-26";
		String bookPublisher = "출판사";
		String bookGenre="판타지";
		int bookPrice = 5000;
		int bookPageCount=300;
		BookDto bookDto = new BookDto();
		bookDto.setBook_author(bookAuthor);
		bookDto.setBook_genre(bookGenre);
		bookDto.setBook_page_count(bookPageCount);
		bookDto.setBook_price(bookPrice);
		bookDto.setBook_publication_date(bookPublicationDate);
		bookDto.setBook_publisher(bookPublisher);
		bookDto.setBook_title(bookTitle);
		bookDto.setBook_id(bookId);
		int count = sqlsession.update("book.update",bookDto);
		boolean result = count >0;
		log.debug("결과={}",bookDto);
		log.debug("수정 결과={}",result);


	}
}
