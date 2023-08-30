package com.kh1.springhome;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class LoggingTest4 {
	@Test
	public void test() {
		for (int i = 1; i <= 100000000; i++) {
			log.info("log rolling test{}", i);
		}
	}
}
