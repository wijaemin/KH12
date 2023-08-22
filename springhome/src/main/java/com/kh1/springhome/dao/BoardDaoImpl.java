package com.kh1.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh1.springhome.dto.BoardDto;
import com.kh1.springhome.dto.BoardListDto;
import com.kh1.springhome.mapper.BoardListMapper;
import com.kh1.springhome.mapper.BoardMapper;
import com.kh1.springhome.vo.PaginationVO;

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
				+ "board_group,board_parent,board_depth) values(?,?,?,?,?,?,?)";

		Object[] ob = { boardDto.getBoard_no(), boardDto.getBoard_writer(), boardDto.getBoard_title(),
				boardDto.getBoard_content(), boardDto.getBoard_group(), boardDto.getBoard_parent(),
				boardDto.getBoard_depth() };

		tem.update(sql, ob);

	}

	@Override
	public List<BoardListDto> list() {
		// 기존 조회 구문
//		String sql = "select * from board_list order by board_no desc";

		// 계층형 조회 구문
		String sql = "SELECT * FROM board_list " + "connect by Prior  board_no = board_parent "
				+ "start WITH board_parent is NULL " + "order siblings by board_group desc, board_no asc";
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
		String sql = "update board set board_title=?, board_content=?, board_utime=sysdate where board_no = ? ";
		Object[] ob = { boardDto.getBoard_title(), boardDto.getBoard_content(), boardDto.getBoard_no() };
		return tem.update(sql, ob) > 0;
	}

	@Override
	public boolean delete(int board_no) {
		String sql = "delete board where board_no =?";
		Object[] ob = { board_no };
		return tem.update(sql, ob) > 0;
	}

	@Override
	public boolean updateDetail(int board_no) {
		String sql = "update board set board_readcount =board_readcount+1 where board_no=?";
		Object[] ob = { board_no };
		return tem.update(sql, ob) > 0;
	}

	@Override
	public boolean updateLike(int board_no) {
		String sql = "update board set board_likecount =board_likecount+1 where board_no=?";
		Object[] ob = { board_no };
		return tem.update(sql, ob) > 0;
	}

//잘못된 검색 시스템의 예{(
//	@Override
//	public List<BoardDto> selectList(String type,String keyword) {
//		String sql;
//		if(type.equals("board_title") ) {//type이 제목인경우
//			sql= "select * from board where instr(board_title, ?) > 0"
//				+ " order by board_no desc";
//		}
//		else {sql= "select * from board where instr(board_writer , ?) >0"+
//				"order by board_no desc";}//type이 작성자인경우
//		
//		Object[] ob = { keyword };
//		List<BoardDto> list = tem.query(sql, boardlistMapper, ob);
//		return list;
//	}

	// 이게 제일 베스트 인듯?
//	@Override 
//	public List<BoardDto> selectList(String type,String keyword) {
//		String sql= "select * from board where instr("+type+", ?) > 0" //홀더는 "+type+" 이런식으로 해야한다(값(데이터)이 아니기 때문이다.
//				+ " order by board_no desc";
//	
//		Object[] ob = { keyword };
//		List<BoardDto> list = tem.query(sql, boardlistMapper, ob);
//		return list;
//	}

	// 추천 2
	@Override
	public List<BoardListDto> search(String type, String keyword) {
		String sql = "select * from board_list where instr(#1, ?) > 0" + " order by board_no desc";
		sql = sql.replace("#1", type); // 이런방식도 있다. 둘다 사용가능
		Object[] ob = { keyword };
		List<BoardListDto> list = tem.query(sql, boardlistMapper, ob);
		return list;
	}

	@Override
	public Integer selectMax(String board_wirter) {
		String sql = "select max(board_no) from board where board_writer = ?";
		Object[] ob = { board_wirter };
		return tem.queryForObject(sql, Integer.class, ob);
	}

	@Override
	public List<BoardListDto> selectListByPage(int page) {
		// int begin =page * 10-9;
		// int end = page*10;
		String sql = "select * from (" + "select rownum rn, TMP.* from (" + "select * from board_list "
				+ "connect by prior board_no=board_parent " + "start with board_parent is null "
				+ "order siblings by board_group desc, board_no asc" + ")TMP" + ") where rn between ? and ?";
		Object[] ob = { page * 10 - 9, page * 10 };
		return tem.query(sql, boardlistMapper, ob);
	}

	@Override
	public List<BoardListDto> selectListByPage(String type, String keyword, int page) {
		int begin = page * 10 - 9;
		int end = page * 10;
		String sql = "select * from (" + " select rownum rn, TMP.* from (" + " select * from board_list"
				+ " where instr(" + type + ", ?) > 0" + " connect by Prior  board_no = board_parent"
				+ " start WITH board_parent is NULL " + " order siblings by board_group desc, board_no asc" + ")TMP"
				+ ") where rn between ? and ?";

		Object[] ob = { keyword, begin, end };
		return tem.query(sql, boardlistMapper, ob);
	}

	@Override
	public int countList() {
		String sql = "select count(*) from board";
		return tem.queryForObject(sql, int.class);
	}

	@Override
	public int countList(String type, String keyword) {
		String sql = "select count(*) from board where instr(" + type + ",?) > 0";
		Object[] ob = { keyword };
		return tem.queryForObject(sql, int.class, ob);
	}

	@Override
	public int countList(PaginationVO vo) {
		if (vo.isSearch()) {
			String sql = "select count(*) from board where instr(" + vo.getType() + ", ?) > 0";
			Object[] ob = { vo.getKeyword() };
			return tem.queryForObject(sql, int.class, ob);
		} else {
			String sql = "select count(*) from board";
			return tem.queryForObject(sql, int.class);
		}
	}

	@Override
	public List<BoardListDto> selectListByPage(PaginationVO vo) {
		if (vo.isSearch()) {
			return selectListByPage(vo.getType(), vo.getKeyword(), vo.getPage());

		} else {
			return selectListByPage(vo.getPage());
		}
	}

	@Override
	public List<BoardListDto> selectListByBoardWriter(String boardWriter) {
		String sql = "select * from board_list "
				+ "where board_writer = ?"
				+ "order by board_no desc";
		Object[] ob = {boardWriter};
		return tem.query(sql, boardlistMapper,ob);
	
	}

}
