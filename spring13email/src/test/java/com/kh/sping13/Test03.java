
package com.kh.sping13;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.kh.sping13.configuration.EmailProperties;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class Test03 {
	
	//application.properties에 작성된 정보를 불러와서 사용
	@Autowired
	private JavaMailSender sender;
	

	@Test
	public void test() {
		
		// 전송 메세지 - 상대방의 정보와 메일 내용 생설
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("tpfkalrrltk@naver.com");
		message.setSubject("야");
		message.setText("호");

		// 전송
		sender.send(message);

	}
}