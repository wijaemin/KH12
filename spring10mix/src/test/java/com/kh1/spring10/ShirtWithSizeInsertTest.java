package com.kh1.spring10;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh1.spring10.dao.ShirtDao;
import com.kh1.spring10.dao.ShirtSizeDao;
import com.kh1.spring10.dto.ShirtDto;
import com.kh1.spring10.dto.ShirtSizeDto;

@SpringBootTest
public class ShirtWithSizeInsertTest {
	@Autowired
	ShirtSizeDao shritSizeDao;
	@Autowired
	ShirtDao shritDao;

	@Test
	public void test() {
		// 목표 : 사이즈(M,L,XL)만 존재하는 셔츠를 등록
		// 순서
		// 1.셔츠
		// 2.M사이즈 정보등록
		// 3.L사이즈 정보등록
		// 4.XL사이즈 정보등록

		// 1.
		ShirtDto shirtDto = new ShirtDto();
		shirtDto.setShirt_name("사이즈 있는옷");
		shirtDto.setShirt_color("블랙");
		shirtDto.setShirt_price(5500);
		shirtDto.setShirt_kind("브이넥");
		shirtDto.setShirt_type("반팔");
		shirtDto.setShirt_material("면");
		shirtDto.setShirt_stock(50);

		int shirt_no = shritDao.sequence();
		shirtDto.setShirt_no(shirt_no);

		shritDao.add(shirtDto);


		// 2
		ShirtSizeDto sizeDto = new ShirtSizeDto();
		sizeDto.setShirt_no(shirt_no);
		sizeDto.setShirt_size_name("M");
		ShirtSizeDao.insert(sizeDto);

		// 3
		ShirtSizeDto sizeDto = new ShirtSizeDto();
		sizeDto.setShirt_no(shirt_no);
		sizeDto.setShirt_size_name("L");
		shirtSizeDao.insert(sizeDto2);

		// 4
		ShirtSizeDto sizeDto = new ShirtSizeDto();
		sizeDto.setShirt_no(shirt_no);
		sizeDto.setShirt_size_name("XL");
		shirtSizeDao.insert(sizeDto3);

	}

}
