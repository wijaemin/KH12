package com.kh1.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


import com.kh1.springhome.dto.BoardListDto;

@Component
public class BoardListMapper implements RowMapper<BoardListDto>{

	@Override
	public BoardListDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BoardListDto boardListDto = new BoardListDto();
		boardListDto.setBoard_ctime(rs.getDate("board_ctime"));
		boardListDto.setBoard_likecount(rs.getInt("board_likecount"));
		boardListDto.setBoard_no(rs.getInt("board_no"));
		boardListDto.setBoard_readcount(rs.getInt("board_readcount"));
		boardListDto.setBoard_replycount(rs.getInt("board_replycount"));
		boardListDto.setBoard_title(rs.getString("board_title"));
		boardListDto.setBoard_utime(rs.getDate("board_utime"));
		boardListDto.setBoard_writer(rs.getString("board_writer"));
		
		
		boardListDto.setMember_nickname(rs.getString("member_nickname"));
		
		
		//1.int로 꺼낸다(null이 0으로 조회됨)	
		// boardDto.setBoard_parent(rs.getInt("board_parent"));
		
		//2.integer 형태로 꺼낸다.(null이 그대로 조회됨
		boardListDto.setBoard_parent(rs.getObject("board_parent", Integer.class));
		
		boardListDto.setBoard_group(rs.getInt("board_group"));
		boardListDto.setBoard_depth(rs.getInt("board_depth"));
		return boardListDto ;
	}

}
