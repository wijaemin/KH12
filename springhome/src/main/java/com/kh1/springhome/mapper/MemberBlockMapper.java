package com.kh1.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kh1.springhome.dto.MemberBlockDto;

public class MemberBlockMapper implements RowMapper<MemberBlockDto>{

	@Override
	public MemberBlockDto mapRow(ResultSet rs, int rowNum) throws SQLException {
	MemberBlockDto memberBlockDto = new MemberBlockDto();
	memberBlockDto.setBlockTime(rs.getDate("block_time"));
	memberBlockDto.setMemberId(rs.getString("member_id"));
		return memberBlockDto;
	}

}
