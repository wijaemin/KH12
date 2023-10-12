package com.kh.spring16;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class Test02 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {
		List<CustomerDto> list =sqlsession.selectList("customer.list");
		log.debug("최대갯수={}",list.size());
		
		for(CustomerDto dto: list) {
			log.debug("목록={}",dto);
		}

	}
}
