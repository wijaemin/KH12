package com.kh1.springhome;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh1.springhome.dao.BoardDao;
import com.kh1.springhome.dto.BoardDto;
import com.kh1.springhome.dto.BoardListDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class boardSearchTest {
	@Autowired
	BoardDao boardDao;

	@Test
public void test() {
		String type = "board_writer";
		String keyword = "test";
		List<BoardListDto> list = boardDao.search(type, keyword);
		log.debug("결과수:{}", list.size());
	}
}
