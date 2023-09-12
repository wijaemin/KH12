package com.kh1.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh1.springhome.dto.StatDto;

@Component
public class StatMapper implements RowMapper<StatDto> {

	@Override
	public StatDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		StatDto statDto = new StatDto();
		statDto.setCnt(rs.getInt("cnt"));
		statDto.setName(rs.getString("name"));
		return statDto;
	}

}
