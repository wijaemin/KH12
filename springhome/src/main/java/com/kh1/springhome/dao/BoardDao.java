package com.kh1.springhome.dao;

import java.util.List;

import com.kh1.springhome.dto.BoardDto;

public interface BoardDao {
	void write(BoardDto boardDto);

	public List<BoardDto> list();

	public int sequence();

	public BoardDto detail(int board_no);

	public boolean edit(BoardDto dto);

	public boolean updateUtime(int board_no);

	public boolean updateDetail(int board_no);
	
	public boolean updateLike(int board_no);

	public boolean delete(int board_no);

	public List<BoardDto> Search(String keyWord);

}
