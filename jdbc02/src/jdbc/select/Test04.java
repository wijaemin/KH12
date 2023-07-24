package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.boardDto;
import jdbc.mapper.boardMapper;
import jdbc.util.jdbcUtils;

public class Test04 {
public static void main(String[] args) {
	String keyword  = "김지권";
	boardMapper mapper = new boardMapper();
	String sql = "select * from ("
			+ "			select rownum rn, TMP.* from ("
			+ "				select * from board order by length(board_content) asc"
			+ "			)TMP"
			+ "		) where rn between 1 and 3";
	String sql1 = "select * from board where instr(board_title, ?) >0 order by board_no desc";
	Object[] ob = {keyword};
	JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
	List<boardDto> list = tem.query(sql1,mapper,ob);
	for(boardDto dto : list) {System.out.println(dto);}
}
}
