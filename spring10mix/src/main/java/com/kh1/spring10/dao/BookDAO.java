package com.kh1.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.kh1.spring10.dto.BookDTO;
import com.kh1.spring10.mapper.BookMapper;

@Component
public class BookDAO {
	@Autowired
	JdbcTemplate tem;
	@Autowired
	BookMapper mapper;

	public void save(BookDTO dto) {
		String sql = "insert into book(book_id,book_title,book_author,book_publication_date,"
				+ "book_price,book_publisher,book_page_count,book_genre)" + " values(?,?,?,?,?,?,?,?)";
		Object[] ob = { dto.getBookID(), dto.getBookTitle(), dto.getBookAuthor(), dto.getBookPublicationDate(),
				dto.getBookPrice(), dto.getBookPublisher(), dto.getBookPageCount(), dto.getBookGenre() };
		tem.update(sql, ob);
	}

	public boolean edit(BookDTO dto) {
		String sql = "update book set book_title = ? where book_id = ?";
		Object[] ob = { dto.getBookTitle(), dto.getBookID() };
		return tem.update(sql, ob)>0;

	}

	public boolean delete(int no) {
		String sql = "delete * from book where book_id = ?";
		Object[] ob = {no};
		return tem.update(sql, ob)>0;

	}

	public List<BookDTO> list() {
		String sql = "select * from book order by book_id asc";
		return tem.query(sql, mapper) ;
	}

	public BookDTO detail(int no) {
		String sql = "select * from book where book_id = ?";
		Object[] ob = { no };
		List<BookDTO> list = tem.query(sql, mapper, ob);
		return list.isEmpty() ? null : list.get(0);

	}
}