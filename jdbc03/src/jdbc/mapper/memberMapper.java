package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.memberDto;

public class memberMapper implements RowMapper<memberDto> {

	@Override
	public memberDto mapRow(ResultSet rs, int ixl) throws SQLException {
		memberDto dto = new memberDto();
		dto.setMember_birth(rs.getDate("member_birth"));
		dto.setMember_contact(rs.getInt("member_contact"));
		dto.setMember_email(rs.getString("member_email"));
		dto.setMember_id(rs.getString("member_id"));
		dto.setMember_join(rs.getDate("member_join"));
		dto.setMember_level(rs.getString("member_level"));
		dto.setMember_nickname(rs.getString("member_nickname"));
		dto.setMember_point(rs.getInt("member_point"));
		dto.setMember_pw(rs.getString("member_pw"));
		return dto;
	}

}
