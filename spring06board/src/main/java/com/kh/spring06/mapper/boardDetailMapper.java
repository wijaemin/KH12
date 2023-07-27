package com.kh.spring06.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.spring06.dto.boardDTO;
//전부 조회하는 Mapper
@Component
public class boardDetailMapper implements RowMapper<boardDTO>{


@Override
public boardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
	boardDTO dto = new boardDTO();
	dto.setBoard_no(rs.getInt("board_no"));
	dto.setBoard_title(rs.getString("board_title"));
	dto.setBoard_content(rs.getString("board_content"));
	dto.setBoard_writer(rs.getString("board_writer"));
	dto.setBoard_readcount(rs.getInt("board_readcount"));
	return dto;
}
	
}
