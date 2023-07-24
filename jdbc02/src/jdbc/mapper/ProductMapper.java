package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.ProductDto;

public class ProductMapper implements RowMapper<ProductDto> {

	@Override
	public ProductDto mapRow(ResultSet rs, int idx) throws SQLException {
		ProductDto dto = new ProductDto();
		dto.setName(rs.getString("name"));
		dto.setNo(rs.getInt("no"));
		dto.setPrice(rs.getInt("price"));
		dto.setType(rs.getString("type"));
		dto.setMade(rs.getDate("made"));
		return dto;
	}

}
