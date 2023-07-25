package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.bookDto;

public class bookMapper implements RowMapper<bookDto> {

	@Override
	public bookDto mapRow(ResultSet rs, int dxl) throws SQLException {
		bookDto dto = new bookDto();
		dto.setBook_id(rs.getInt("book_id"));
		dto.setBook_author(rs.getString("book_author"));
		dto.setBook_genre(rs.getString("book_genre"));
		dto.setBook_page_count(rs.getInt("book_page_count"));
		dto.setBook_price(rs.getDouble("book_price"));
		dto.setBook_publication_date(rs.getDate("book_publication_date"));
		dto.setBook_title(rs.getString("book_title"));
		dto.setBook_publisher(rs.getString("book_publisher"));
		return dto;
	}

}
