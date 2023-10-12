package com.kh.spring14mybatis;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14mybatis.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class test01 {
	
@Autowired
private SqlSession sqlsession;

@Test
public void test() {
	//구문 어딘가(mapper)에 저장해두고 불러와서 사용
	List<PocketmonDto> list =sqlsession.selectList("pocketmon.list");
	log.debug("개수= {}",list.size());
	
	for(PocketmonDto dto : list) {
		log.debug("dto= {}",dto);
		
	}
}

}
