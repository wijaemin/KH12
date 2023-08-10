package com.kh1.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh1.springhome.dto.BoardDto;

@Component
public class BoardListMapper implements RowMapper<BoardDto>{

	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDto boardDto = new BoardDto();
		boardDto.setBoard_ctime(rs.getDate("board_ctime"));
		boardDto.setBoard_likecount(rs.getInt("board_likecount"));
		boardDto.setBoard_no(rs.getInt("board_no"));
		boardDto.setBoard_readcount(rs.getInt("board_readcount"));
		boardDto.setBoard_replycount(rs.getInt("board_replycount"));
		boardDto.setBoard_title(rs.getString("board_title"));
		boardDto.setBoard_utime(rs.getDate("board_utime"));
		boardDto.setBoard_writer(rs.getString("board_writer"));
		return boardDto ;
	}

}
