package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.bookDto;
import jdbc.util.jdbcUtils;

public class bookDao {

	public void insert(bookDto dto) {
		String sql = "insert into book(book_id,book_title,book_author,book_publication_date,book_price,book_publisher,book_page_count"
				+ ", book_genre) values(?,?,?,?,?,?,?,?)";
		Object[] ob = { dto.getBook_id(), dto.getBook_title(), dto.getBook_author(), dto.getBook_publication_date(),
				dto.getBook_publisher(), dto.getBook_page_count(), dto.getBook_genre() };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		tem.update(sql, ob);
	}

	public boolean updateBookPrice(bookDto dto) {
		String sql = "update book set book_price = ? where book_id = ?";
		Object[] data = { dto.getBook_pirce(), dto.getBook_id() };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		int result = tem.update(sql, data);
		if (result > 0)
			return true;
		else
			return false;
	}

	public boolean updateBookInfo(bookDto dto) {
		String sql = "update book set book_title = ? , book_author = ? , book_publisher = ? where book_id =?";
		Object[] ob = { dto.getBook_title(), dto.getBook_author(), dto.getBook_publisher(), dto.getBook_id() };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		int result = tem.update(sql, ob);
		return result > 0;
	}

}
