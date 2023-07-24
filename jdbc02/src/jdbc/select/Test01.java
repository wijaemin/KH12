package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.JdbcUtils;

import jdbc.dto.PocketmonDto;
import jdbc.mapper.PocketmonMapper;
import jdbc.util.jdbcUtils;

public class Test01 {
	public static void main(String[] args) {

		String sql = " select * from pocketmon order by no asc";
		PocketmonMapper mapper = new PocketmonMapper();
		JdbcTemplate template = jdbcUtils.getJdbcTemplate();
		List<PocketmonDto> list = template.query(sql, mapper);

		System.out.println("조회 결과 : "+list.size());
		for(PocketmonDto dto : list) {
			System.out.println(dto);
		}
	}
}
