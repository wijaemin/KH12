package com.kh1.spring10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh1.spring10.dto.ShirtSizeDto;

@Component
public class ShirtSizeMapper implements RowMapper<ShirtSizeDto>{

	@Override
	public ShirtSizeDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ShirtSizeDto dto = new ShirtSizeDto();
		dto.setShirt_no(rs.getInt("shirt_no"));
		dto.setShirt_size_name(rs.getString("shirt_size_name"));
		return dto;
	}

}
