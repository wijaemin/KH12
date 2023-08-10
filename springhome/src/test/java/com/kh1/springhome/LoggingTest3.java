package com.kh1.springhome;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class LoggingTest3 {
	@Test
	public void test() {
		// logger의 사용법
		// -일반적인 메세지 출력은 System.out.println();과 같다.
		System.out.println("Hello!");
		log.info("Hello!");

		// 변수등을 출력할때 홀더를 제공한다.
		int a = 10;
		System.out.println("a =" + a);
		log.info("a =" + a);
		log.info("a ={}", a);

		int b = 20;
		int c = 30;
		System.out.println(b + "+" + c + "=" + (b + c));
		log.info("{}+{}={}", b, c, b + c);
	}
}
