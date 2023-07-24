package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.memberDto;
import jdbc.mapper.memberMapper;
import jdbc.util.jdbcUtils;

public class Test05 {
public static void main(String[] args) {
	String sql = "select * from member order by member_id asc";
	memberMapper mapper =new memberMapper();
	JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
	List<memberDto> list = tem.query(sql, mapper);
	for(memberDto dto : list ) {System.out.println(dto);}
}
}
