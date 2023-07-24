package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.boardDto;

public class boardMapper implements RowMapper<boardDto> {

	@Override
	public boardDto mapRow(ResultSet rs, int ixl) throws SQLException {
		boardDto dto = new boardDto();
		dto.setBoard_content(rs.getString("board_content"));
		dto.setBoard_no(rs.getInt("board_no"));
		dto.setBoard_readcount(rs.getInt("board_readcount"));
		dto.setBoard_title(rs.getString("board_title"));
		dto.setBoard_writer(rs.getString("board_writer"));
		return dto;
	}

}
