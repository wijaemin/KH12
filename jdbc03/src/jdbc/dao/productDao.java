package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.ProductDto;
import jdbc.util.jdbcUtils;

public class productDao {

	public void insert(ProductDto dto) {
		String sql = "insert into product(no,name,type,price, made,expire) values(?,?,?,?,?,?)";
		Object[] ob = {dto.getNo(),dto.getName(),dto.getType(),dto.getPrice(),dto.getMade(),dto.getExpire()};
		JdbcTemplate tem= jdbcUtils.getJdbcTemplate();
		tem.update(sql,ob);
		
	}
}
