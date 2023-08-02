package com.kh1.spring10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh1.spring10.dto.MemberDTO;
@Component
public class MemberMapper implements RowMapper<MemberDTO>{

	@Override
	public MemberDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
 MemberDTO dto= new MemberDTO();
 dto.setMemberBirth(rs.getString("member_birth"));
 dto.setMemberContact(rs.getString("member_contact"));
 dto.setMemberEmail(rs.getString("member_email"));
 dto.setMemberId(rs.getString("member_id"));
 dto.setMemberJoin(rs.getDate("member_join"));
 dto.setMemberLevel(rs.getString("member_level"));
 dto.setMemberNickname(rs.getString("member_nickname"));
 dto.setMemberPoint(rs.getInt("member_point"));
 dto.setMemberPw(rs.getString("member_pw"));
		return dto;
	}

}