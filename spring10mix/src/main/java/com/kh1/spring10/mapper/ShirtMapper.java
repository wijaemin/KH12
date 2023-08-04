package com.kh1.spring10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh1.spring10.dto.ShirtDto;

@Component
public class ShirtMapper implements RowMapper<ShirtDto> {
	@Autowired
	JdbcTemplate tem;

	@Override
	public ShirtDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ShirtDto dto = new ShirtDto();
		dto.setShirt_color(rs.getString("shirt_color"));
		dto.setShirt_kind(rs.getString("shirt_kind"));
		dto.setShirt_material(rs.getString("shirt_material"));
		dto.setShirt_name(rs.getString("shirt_name"));
		dto.setShirt_no(rs.getInt("shirt_no"));
		dto.setShirt_price(rs.getInt("shirt_price"));
		dto.setShirt_stock(rs.getInt("shirt_stock"));
		dto.setShirt_type(rs.getString("shirt_type"));

		return dto;
	}

}
