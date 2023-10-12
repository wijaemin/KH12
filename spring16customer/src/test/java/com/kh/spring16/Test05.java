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
public class Test05 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {
	
			sqlsession.update("customer.update", 	
					CustomerDto.builder().customerNo(1)
					.customerContact("010-2246-6759")
					.customerId("testuser11")
					.customerJoin("1992-10-26")
					.customerLevel("VIP")
					.customerMileage(29)
					.customerPurchase("1992-10-26")
					.build());
	}
}
