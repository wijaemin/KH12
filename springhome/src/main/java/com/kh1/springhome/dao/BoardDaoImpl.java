package com.kh1.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh1.springhome.dto.BoardDto;
import com.kh1.springhome.mapper.BoardListMapper;
import com.kh1.springhome.mapper.BoardMapper;

@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	JdbcTemplate tem;
	@Autowired
	BoardListMapper boardlistMapper;
	@Autowired
	BoardMapper boardMapper;

	@Override
	public void write(BoardDto boardDto) {
		String sql = "insert into board(board_no,board_writer,board_title,board_content,"
				+ "board_readcount,board_likecount,board_replycount,board_ctime,"
				+ "board_utime) values(board_seq.nextval,?,?,?,?,?,?,?,?)";
		Object[] ob = { boardDto.getBoard_writer(), boardDto.getBoard_title(), boardDto.getBoard_content(),
				boardDto.getBoard_readcount(), boardDto.getBoard_likecount(), boardDto.getBoard_replycount(),
				boardDto.getBoard_ctime(), boardDto.getBoard_utime() };
		tem.update(sql, ob);

	}

	@Override
	public List<BoardDto> list() {
		String sql = "select * from board order by board_no asc";
		return tem.query(sql, boardlistMapper);
	}

	@Override
	public int sequence() {
		String sql = "select board_seq.nextval from dual";
		return tem.queryForObject(sql, int.class);
	}

	@Override
	public BoardDto detail(int board_no) {
		String sql = "select * from board where board_no= ?";
		Object[] ob = { board_no };
		List<BoardDto> list = tem.query(sql, boardMapper, ob);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public boolean edit(BoardDto boardDto) {
		String sql = "update board set board_title=?, board_content=? where board_no = ? ";
		Object[] ob = {boardDto.getBoard_title(),boardDto.getBoard_content() ,boardDto.getBoard_no() };
		return tem.update(sql, ob) > 0;
	}
}
