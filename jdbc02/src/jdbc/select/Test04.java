package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.boardDto;
import jdbc.mapper.boardMapper;
import jdbc.util.jdbcUtils;

public class Test04 {
public static void main(String[] args) {
	
	boardMapper mapper = new boardMapper();
	String sql = "select *from board order by board_no asc";
	JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
	List<boardDto> list = tem.query(sql,mapper);
	
	for(boardDto dto : list) {System.out.println(dto);}
}
}
