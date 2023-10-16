package com.kh.spring18;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test02 {

	@Test
	public void test() {
int number = 5;

number *=12345 ;
number +=12345 ;
number *=12345 ;
number %=123456789 ;
log.debug("number={}",number);
}}
