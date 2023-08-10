package com.kh1.springhome.dao;

import java.util.List;


import com.kh1.springhome.dto.BoardDto;


public interface BoardDao {
	void write(BoardDto boardDto);

	public List<BoardDto> list();
	public int sequence();
	public BoardDto detail(int board_no);
	public boolean edit(BoardDto dto);
}
