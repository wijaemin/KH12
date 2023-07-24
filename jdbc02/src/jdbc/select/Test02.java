package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.JdbcTransactionManager;

import jdbc.dto.ProductDto;
import jdbc.mapper.ProductMapper;
import jdbc.util.jdbcUtils;

public class Test02 {
public static void main(String[] args) {
	String sql= "select * from product order by no asc";
	ProductMapper mapper = new ProductMapper();
	JdbcTemplate JdbcTransactionManager = jdbcUtils.getJdbcTemplate();
	List<ProductDto>list = JdbcTransactionManager.query(sql, mapper);
	
	for(ProductDto dto : list) {
		System.out.println(dto);
	}
}
}
