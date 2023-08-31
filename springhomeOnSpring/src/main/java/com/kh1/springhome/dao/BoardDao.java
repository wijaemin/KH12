package com.kh1.springhome.dao;

import java.util.List;

import com.kh1.springhome.dto.BoardDto;
import com.kh1.springhome.dto.BoardListDto;
import com.kh1.springhome.vo.PaginationVO;

public interface BoardDao {
	void write(BoardDto boardDto);

	public List<BoardListDto> list();

	public int sequence();

	public BoardDto detail(int board_no);

	public boolean edit(BoardDto dto);

	public boolean updateDetail(int board_no);
	
	public boolean updateLike(int board_no);

	public boolean delete(int board_no);

	public List<BoardListDto> search(String type, String keyword);

	public Integer selectMax(String board_wirter);
	
	public List<BoardListDto> selectListByPage(String type, String keyword, int page);
	public List<BoardListDto> selectListByPage(int page);
	
	public List<BoardListDto> selectListByPage(PaginationVO vo);
	public int countList();
	public int countList(String type, String keyword);  
	
	public int countList(PaginationVO vo);
	
	//특정 사용자가 작성한 글을 조회하는 메소드
	List<BoardListDto> selectListByBoardWriter(String boardWriter);
}
