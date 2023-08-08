package com.kh1.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh1.springhome.dto.MemberDto;

@Component
public class MemberMapper implements RowMapper<MemberDto> {

	@Override
	public MemberDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		MemberDto memberDto = new MemberDto();
		memberDto.setMemberAddr1(rs.getString("member_addr1"));
		memberDto.setMemberAddr2(rs.getString("member_addr2"));
		memberDto.setMemberBirth(rs.getString("member_brith"));
		memberDto.setMemberChange(rs.getDate("member_chane"));
		memberDto.setMemberContact(rs.getString("member_contact"));
		memberDto.setMemberEmail(rs.getString("member_email"));
		memberDto.setMemberId(rs.getString("member_id"));
		memberDto.setMemberJoin(rs.getDate("member_join"));
		memberDto.setMemberLevel(rs.getString("member_level"));
		memberDto.setMemberNick(rs.getString("member_nickname"));
		memberDto.setMemberPoint(rs.getInt("member_point"));
		memberDto.setMemberPost(rs.getString("member_post"));
		memberDto.setMemberPw(rs.getString("member_pw"));
		memberDto.setMemeberLogin(rs.getDate("member_login"));
		return memberDto;
	}

}
