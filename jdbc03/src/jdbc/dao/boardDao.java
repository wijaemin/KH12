package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.boardDto;
import jdbc.util.jdbcUtils;

public class boardDao {

	public void insert(boardDto dto) {
		String sql = "insert into board(board_no,board_title, board_content,board_writer ,board_readcount)"
				+ "values(? ,? , ? , ? , ? )";
		Object[] ob = {dto.getBoard_no(), dto.getBoard_title(), dto.getBoard_content(), dto.getBoard_writer(), dto.getBoard_readcount()};
		JdbcTemplate template = jdbcUtils.getJdbcTemplate();
		template.update(sql,ob);
	}
	
	public boolean update(boardDto dto) {
		String sql = "update board set board_title = ? , board_content = ? , board_writer = ? , board_readcount = ?  where board_no = ?";
		Object[] ob  = {dto.getBoard_title(),dto.getBoard_content(), dto.getBoard_writer(), dto.getBoard_readcount(), dto.getBoard_no()};
		JdbcTemplate tem= jdbcUtils.getJdbcTemplate();
		int result =tem.update(sql,ob);
		if (result>0) return true;
		else return false;
		
		
	}
}
