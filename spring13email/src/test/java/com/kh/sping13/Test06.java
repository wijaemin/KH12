package com.kh.sping13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test06 {

	@Autowired
	private JavaMailSender sender;

	@Test
	public void test() throws MessagingException, IOException  {
		//목표: 외부에 만들어 놓은 파일에 있는 HTML을 불러와서 전송(/template/email.html)
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, false,"UTF-8");
		
		helper.setTo("tpfkalrrltk@naver.com");
		helper.setSubject("이메일 템플릿 전송 예제");
		helper.setText("sad", true);
		
		//classpath에 있는 template 폴더의 email.html을 불러오는 코드
		ClassPathResource resource = new ClassPathResource("templates/email2.html"); //classpath 자원 선택
		File target = resource.getFile(); //파일추출
		Scanner sc = new Scanner(target);//읽을수 있는 도구 연결
		StringBuffer buffer = new StringBuffer();// 저장할 수 있는 버퍼 생성
		while(sc.hasNextLine()) {// 더읽을 줄이 있다면
			buffer.append(sc.nextLine());//읽어서 버퍼 추가
		}
		String text = buffer.toString(); //읽어들인  결과를  1차 저장
		//text = text.replace("#1", "바꿀 키워드"); //추천하지 않음
		
		//HTML 해석하여 변경하는 방법(추천)
		Document doc = Jsoup.parse(text);
		Element who = doc.getElementById("who");//who라는 아이디를 가진 태그를 찾아라!
		who.text("고객님");
		
		Element link = doc.getElementById("link");//link라는 아이디를 가진 태그를 찾아라!
		link.attr("href","http://www.naver.com");//가져온 태그의 href 속성을 변경해라!
		
		helper.setText(doc.toString(), true); //설정한  내용을 이메일 본문으로 설정
		
		sender.send(message);
	}
}
