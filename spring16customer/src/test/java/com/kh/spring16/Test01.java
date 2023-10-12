package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.kh.spring16.dto.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class Test01 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {

		sqlsession.insert("customer.add",CustomerDto.builder()
				.customerContact("010-2146-6559")
				.customerId("tpfkalrrltk1")
				.customerJoin("1992-10-26")
				.customerLevel("VIP")
				.customerMileage(29)
				.customerPurchase("1992-10-26")
				.build());
		log.debug("결과={}",CustomerDto.builder());
	}
}
