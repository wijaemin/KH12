package com.kh1.springhome.dao;

import java.util.List;

import com.kh1.springhome.dto.BoardDto;

public interface BoardDao {
	void write(BoardDto boardDto);

	public List<BoardDto> list();

	public int sequence();

	public BoardDto detail(int board_no);

	public boolean edit(BoardDto dto);
<<<<<<< HEAD

	public boolean updateUtime(int board_no);

	public boolean updateDetail(int board_no);

	public boolean delete(int board_no);

	public List<BoardDto> SearchContaining(String keyWord);
	
	 Page<BoardDto> findByTitleContaining(String searchKeyword, Pageable pageable);
}
=======
	public boolean updateUtime(int board_no);
	public boolean delete(int board_no);
}
>>>>>>> branch 'main' of https://github.com/tpfkalrrltk/KH12.git
