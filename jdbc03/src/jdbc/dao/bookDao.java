package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.bookDto;
import jdbc.util.jdbcUtils;

public class bookDao {

	public void insert(bookDto dto) {
		String sql ="insert into book(book_id,book_title,book_author,book_publication_date,book_price,book_publisher,book_page_count"
				+ ", book_genre) values(?,?,?,?,?,?,?,?)";
		Object[] ob = {dto.getBook_id(),dto.getBook_title(),dto.getBook_author(),dto.getBook_publication_date()
				,dto.getBook_publisher(),dto.getBook_page_count(),dto.getBook_genre()};
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		tem.update(sql,ob);
	}
}
