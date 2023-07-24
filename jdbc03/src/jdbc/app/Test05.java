package jdbc.app;

import java.sql.Date;

import jdbc.dao.productDao;
import jdbc.dto.ProductDto;
import oracle.sql.DATE;

public class Test05 {
public static void main(String[] args) {
	productDao dao= new productDao();
	
	ProductDto dto = new ProductDto();
	dto.setNo(16);
	dto.setExpire(Date.valueOf("2022-02-02"));
	dto.setMade(Date.valueOf("2020-02-02"));
	dto.setName("우유소주");
	dto.setPrice(2500);
	dto.setType("주류");
	dao.insert(dto);
	System.out.println("완료");
}
}
