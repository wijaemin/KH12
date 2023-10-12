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
public class Test06 {

	@Autowired
	SqlSession sqlsession;

	@Test
	public void test() {
		int customerNo = 1;
		sqlsession.delete("customer.remove", customerNo);
	}
}
