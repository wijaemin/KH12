package com.kh.spring07.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.spring07.dto.BookDTO;

@Component
public class BookMapper implements RowMapper<BookDTO> {

	@Override
	public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		BookDTO dto = new BookDTO();
	dto.setBookID(rs.getInt("book_id"));
	dto.setBookTitle(rs.getString("book_title"));
	dto.setBookAuthor(rs.getString("book_author"));
	dto.setBookPublicationDate(rs.getString("book_publication_date"));
	dto.setBookPrice(rs.getDouble("book_price"));
	dto.setBookPublisher(rs.getString("book_publisher"));
	dto.setBookPageCount(rs.getInt("book_page_count"));
	dto.setBookGenre(rs.getString("book_genre"));
		return dto;
	}

}
