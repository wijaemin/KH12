package com.kh.spring12file.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.spring12file.dto.AttachDto;

@Component
public class AttachMapper implements RowMapper<AttachDto> {

	@Override
	public AttachDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		AttachDto attachDto = new AttachDto();
		attachDto.setAttachName(rs.getString("attach_name"));
		attachDto.setAttachNo(rs.getInt("attach_no"));
		attachDto.setAttachSize(rs.getLong("attach_size"));
		attachDto.setAttachTime(rs.getDate("attach_time"));
		attachDto.setAttachType(rs.getString("attach_type"));
		return attachDto;
	}

}
