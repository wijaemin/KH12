package com.kh.spring06.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring06.dto.boardDTO;
import com.kh.spring06.mapper.boardDetailMapper;
import com.kh.spring06.mapper.boardListMapper;

@Repository
public class boardDAO {
	@Autowired
	JdbcTemplate tem;
	@Autowired
	boardListMapper listMapper;
	@Autowired
	boardDetailMapper mapper;

	public void insert(boardDTO dto) {
		String sql = "insert into board(board_no,board_title,board_content,board_writer,board_readcount)"
				+ " values(?,?,?,?,?)";
		Object[] ob = { dto.getBoard_no(), dto.getBoard_title(), dto.getBoard_content(), dto.getBoard_writer(),
				dto.getBoard_readcount() };
		tem.update(sql, ob);
	}

	public boolean update(boardDTO dto) {
		String sql = "update board set board_title = ? , board_content = ?, board_writer = ? where board_no = ?";
		Object[] ob = { dto.getBoard_title(), dto.getBoard_content(), dto.getBoard_writer(), dto.getBoard_no() };
		tem.update(sql, ob);
		return tem.update(sql, ob) > 0;
	}

	public boolean delete(int no) {
		String sql = "delete board where board_no = ?";
		Object[] ob = { no };
		return tem.update(sql, ob) > 0;
	}

	public List<boardDTO> detailList() {
		String sql = "select * from board order by board_no asc";
		return tem.query(sql, mapper);
	}

	public List<boardDTO> selectList() {
		String sql = "select board_no,board_title,board_writer,board_readcount from board order by board_no asc";
		return tem.query(sql, listMapper);
	}

	public boardDTO selectOne(int no) {
		String sql = "select * from board where board_no = ? ";
		Object[] ob = { no };
		List<boardDTO> list = tem.query(sql, mapper, ob);
		return list.isEmpty() ? null : list.get(0);

	}
}
