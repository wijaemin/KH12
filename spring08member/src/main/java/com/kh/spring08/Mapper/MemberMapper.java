package com.kh.spring08.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.spring08.DTO.MemberDTO;
@Component
public class MemberMapper implements RowMapper<MemberDTO>{

	@Override
	public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
 MemberDTO dto= new MemberDTO();
 dto.setMemberBrith(rs.getString("member_birth"));
 dto.setMemberContact(rs.getString("member_contact"));
 dto.setMemberEmail(rs.getString("member_email"));
 dto.setMemberID(rs.getString("member_id"));
 dto.setMemberJon(rs.getDate("member_join"));
 dto.setMemberLevel(rs.getString("member_level"));
 dto.setMemberNickname(rs.getString("member_nickname"));
 dto.setMemberPoint(rs.getInt("member_point"));
 dto.setMemberPW(rs.getString("member_pw"));
		return dto;
	}

}
