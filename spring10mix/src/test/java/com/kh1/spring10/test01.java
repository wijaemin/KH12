package com.kh1.spring10;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh1.spring10.dao.ShirtDao;
import com.kh1.spring10.dto.ShirtDto;

//스프링 테스트 공간
//- 스프링에서는 개발중인 도구들 테스트 할수 있도록 기능을 제공
//- JUnit이라는 자바 테스팅 프레임워크를 가져다가 스프링화 시켜서 사용
//- spring-boot-tester-test라는 의존성에서 모두 제공	

@SpringBootTest//스프링에서 등록한 모든 도구를 가져다 쓸수 있다.
public class test01 {

	@Autowired
	private ShirtDao dao;
	
	@Test//JUnit을 이용하여 테스트를 할 코드를 작성하는 메소드
	public void test() {
		ShirtDto dto = new ShirtDto();
		dto.setShirt_name("테스트 셔츠");
		dto.setShirt_color("블랙");
		dto.setShirt_price(1000);
		dto.setShirt_kind("라운드");
		dto.setShirt_type("민소매");
		dto.setShirt_material("폴리에스테르");
		dto.setShirt_stock(50);
		
		int shirt_no = dao.sequence();
		dto.setShirt_no(shirt_no);
		
		dao.add(dto);
	
	}
}
