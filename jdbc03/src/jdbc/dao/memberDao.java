package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.memberDto;
import jdbc.util.jdbcUtils;

public class memberDao {

	public void insert(memberDto dto) {
		String sql = "insert into member(member_id,member_pw, member_nickname,member_brith,member_email,member_contact,member_level"
				+ ",member_point,member_join)"
				+ " values(?,?,?,?,?,?,?,?,?)";
		Object[] ob = {dto.getMember_id(), dto.getMember_pw(), dto.getMember_nickname(), dto.getMember_brith(),dto.getMember_email()
				,dto.getMember_contact(),dto.getMember_level(),dto.getMember_point(),dto.getMember_join()};
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		tem.update(sql,ob);
		
	}
}
