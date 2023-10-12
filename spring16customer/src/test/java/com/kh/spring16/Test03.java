package com.kh.spring16;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class Test03 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {
	Map<String, Object> param = new HashMap<>();
	param.put("type", "customer_id");
	param.put("keyword", "test");
	List<CustomerDto>list = sqlsession.selectList("customer.serach", param);
	log.debug("찾기 갯수={}",list.size());
	for(CustomerDto dto : list) {
		log.debug("찾기 목록={}",dto);
	}
	
	}
}
