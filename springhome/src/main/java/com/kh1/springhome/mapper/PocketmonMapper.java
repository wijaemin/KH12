package com.kh1.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh1.springhome.dto.PocketmonDto;

@Component
public class PocketmonMapper implements RowMapper<PocketmonDto>{

	@Override
	public PocketmonDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		PocketmonDto pocketmonDto = new PocketmonDto();
		pocketmonDto.setName(rs.getString("name"));
		pocketmonDto.setNo(rs.getInt("no"));
		pocketmonDto.setType(rs.getString("type"));
		//pocketmonDto.setImage(rs.getInt("attach_no")>0); //int일때는 0이나 1로 구분한다.
		pocketmonDto.setImage(rs.getObject("attach_no")!=null); 

		return pocketmonDto;
	}

}
