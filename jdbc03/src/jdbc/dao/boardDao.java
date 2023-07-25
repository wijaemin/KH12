package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.boardDto;
import jdbc.mapper.boardMapper;
import jdbc.util.jdbcUtils;

public class boardDao {

	public void insert(boardDto dto) {
		String sql = "insert into board(board_no,board_title, board_content,board_writer ,board_readcount)"
				+ "values(? ,? , ? , ? , ? )";
		Object[] ob = { dto.getBoard_no(), dto.getBoard_title(), dto.getBoard_content(), dto.getBoard_writer(),
				dto.getBoard_readcount() };
		JdbcTemplate template = jdbcUtils.getJdbcTemplate();
		template.update(sql, ob);
	}

	public boolean update(boardDto dto) {
		String sql = "update board set board_title = ? , board_content = ? , board_writer = ? , board_readcount = ?  where board_no = ?";
		Object[] ob = { dto.getBoard_title(), dto.getBoard_content(), dto.getBoard_writer(), dto.getBoard_readcount(),
				dto.getBoard_no() };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		int result = tem.update(sql, ob);
		if (result > 0)
			return true;
		else
			return false;
	}

	public boolean delete(int boardNo) {
		String sql = "delete  from board where board_no = ?";
		Object[] ob = { boardNo };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		int result = tem.update(sql, ob);
		return result > 0;
	}

	private boardMapper mapper = new boardMapper();

	public List<boardDto> selectList() {
		String sql = "select * from board";
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		return tem.query(sql, mapper);
	}

	public boardDto selectOne(int num) {
		String sql = "select * from board where board_no = ?";
		Object[] ob = { num };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		List<boardDto> list = tem.query(sql, mapper, ob);
		if (list.isEmpty())
			return null;
		else
			return list.get(0);
	}

	// (심화) 페이징 목록 조회
	public List<boardDto> selectListByPage(int page) {
		int end = page * 10;
		int begin = end - 9;
		String sql = "select * from( select rownum rn, TMP. * from(select * from  board  order by board_no desc) TMP) where rn between ? and ?";
		Object[] ob = { begin, end };
		JdbcTemplate tem = jdbcUtils.getJdbcTemplate();
		return tem.query(sql, mapper, ob);
	}
}
