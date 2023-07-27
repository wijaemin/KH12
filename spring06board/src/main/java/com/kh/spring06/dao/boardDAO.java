package com.kh.spring06.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring06.dto.boardDTO;

@Repository
public class boardDAO {
	@Autowired
	JdbcTemplate tem;

	public void insert(boardDTO dto) {
		String sql = "insert into board(board_no,board_title,board_content,board_writer,board_readcount)"
				+ "values(?,?,?,?,?)";
		Object[] ob = { dto.getBoard_no(), dto.getBoard_title(), dto.getBoard_content(), dto.getBoard_writer(),
				dto.getBoard_readcount() };
		tem.update(sql, ob);
	}
}
