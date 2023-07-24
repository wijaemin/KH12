package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.bookDto;
import jdbc.mapper.bookMapper;
import jdbc.util.jdbcUtils;

public class Test03 {
public static void main(String[] args) {
	
	bookMapper mapper = new bookMapper();
	String sql = "select * from book order by book_id asc";
	JdbcTemplate template =jdbcUtils.getJdbcTemplate();
	List <bookDto> list = template.query(sql, mapper);
	
	for (bookDto dto : list ) {System.out.println(dto);}
}
}
