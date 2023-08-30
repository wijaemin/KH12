package com.kh1.springhome;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh1.springhome.dao.BoardDao;
import com.kh1.springhome.dto.BoardDto;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
public class boardinsert {

	@Autowired
	BoardDao boardDao;
	@Test
	void test() {
		//목표 : 등록이 되는지 테스트
		int board_no = boardDao.sequence();
		log.debug("board_no={}",board_no);
		BoardDto boardDto = new BoardDto();
		 boardDto.setBoard_no(board_no);
		 boardDto.setBoard_title("테스트 제목");
		 boardDto.setBoard_content("테스트 내용");
		 boardDto.setBoard_writer("testuser1");
		 boardDao.edit(boardDto);
	}
}
