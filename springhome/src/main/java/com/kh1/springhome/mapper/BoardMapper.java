package com.kh1.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh1.springhome.dto.BoardDto;

@Component
public class BoardMapper implements RowMapper<BoardDto> {

	@Override
	public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardDto boardDto = new BoardDto();
		boardDto.setBoard_content(rs.getString("board_content"));
		boardDto.setBoard_ctime(rs.getDate("board_ctime"));
		boardDto.setBoard_likecount(rs.getInt("board_likecount"));
		boardDto.setBoard_no(rs.getInt("board_no"));
		boardDto.setBoard_readcount(rs.getInt("board_readcount"));
		boardDto.setBoard_replycount(rs.getInt("board_replycount"));
		boardDto.setBoard_title(rs.getString("board_title"));
		boardDto.setBoard_utime(rs.getDate("board_utime"));
		boardDto.setBoard_writer(rs.getString("board_writer"));
		
		//1.int로 꺼낸다(null이 0으로 조회됨)	
		// boardDto.setBoard_parent(rs.getInt("board_parent"));
		
		//2.integer 형태로 꺼낸다.(null이 그대로 조회됨
		boardDto.setBoard_parent(rs.getObject("board_parent", Integer.class));

		boardDto.setBoard_group(rs.getInt("board_group"));
		boardDto.setBoard_depth(rs.getInt("board_depth"));
		return boardDto;
	}

}
