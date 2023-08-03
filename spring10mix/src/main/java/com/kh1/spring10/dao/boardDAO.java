package com.kh1.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh1.spring10.dto.boardDTO;
import com.kh1.spring10.mapper.boardMapper;

@Repository
public class boardDAO {
	@Autowired
	JdbcTemplate tem;
	@Autowired
	boardMapper mapper;


	//등록과 번호 생성기능을 각각 만듬
	//select board_seq.nextval from dual
	//insert into board(...) values(?,?,?,?,0)
	
	public int sequence() {
		String sql ="select board_seq.nextval from dual";
		return tem.queryForObject(sql,int.class);
	//	return tem.queryForObject(sql,Integer.class);
	}
	public void insert(boardDTO dto) {
		String sql = "insert into board(board_no,board_title,board_content,board_writer,board_readcount)"
				+ " values(?,?,?,?,0)";
		Object[] ob = { dto.getBoard_no(), dto.getBoard_title(), dto.getBoard_content(), dto.getBoard_writer()
				 };
		tem.update(sql, ob);
	}
	
	public boolean update(boardDTO dto) {
		String sql = "update board "
						+ "set board_title=?, board_content=? "
						+ "where board_no=?";
		Object[] data = {
				dto.getBoard_title(), dto.getBoard_content(), 
				dto.getBoard_no()
		};
		return tem.update(sql, data) > 0;
	}
	public boolean delete(int board_no) {
		String sql = "delete board where board_no = ?";
		Object[] ob = { board_no };
		return tem.update(sql, ob) > 0;
	}

	public List<boardDTO> List() {
		String sql = "select * from board order by board_no asc";
		return tem.query(sql, mapper);
	}

	public List<boardDTO> selectList() {
		String sql = "select board_no,board_title,board_writer,board_readcount from board order by board_no asc";
		return tem.query(sql, mapper);
	}

	public boardDTO selectOne(int no) {
		String sql = "select * from board where board_no = ? ";
		Object[] ob = { no };
		List<boardDTO> list = tem.query(sql, mapper, ob);
		return list.isEmpty() ? null : list.get(0);

	}
}
