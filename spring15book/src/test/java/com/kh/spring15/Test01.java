package com.kh.spring15;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring15.dto.BookDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test01 {

	@Autowired
	SqlSession sqlsession;
	@Test
	public void test() {
//		String bookAuthor= "황민하";
//		String bookTitle="황민하연대기";
//		String bookPublicationDate ="1992-10-26";
//		String bookPublisher = "출판사";
//		String bookGenre="판타지";
//		int bookPrice = 5000;
//		int bookPageCount=300;
//		BookDto bookDto = new BookDto();
//		bookDto.setBook_author(bookAuthor);
//		bookDto.setBook_genre(bookGenre);
//		bookDto.setBook_page_count(bookPageCount);
//		bookDto.setBook_price(bookPrice);
//		bookDto.setBook_publication_date(bookPublicationDate);
//		bookDto.setBook_publisher(bookPublisher);
//		bookDto.setBook_title(bookTitle);
		
//		BookDto bookdto = BookDto.builder().book_title("테스트서적").build();
		
		
		sqlsession.insert("book.add",BookDto.builder().book_title("테스트서적")
				.book_author("테스트서적")
				.book_genre("테스트저자")
				.book_page_count(99)
				.book_price(1000)
				.book_publication_date("1992-10-26")
				.book_publisher("테스트출판사")
				.book_title("교양")
				.build());
		
		log.debug("결과={}",BookDto.builder());
	}
}
