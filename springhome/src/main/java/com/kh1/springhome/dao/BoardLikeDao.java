package com.kh1.springhome.dao;

import com.kh1.springhome.dto.BoardLikeDto;

//복합키로 구성된 테이블 이므로 기본키 대신 DTO를 사용
public interface BoardLikeDao {
	void insert(BoardLikeDto boardLikeDto);

	boolean delete(BoardLikeDto boardLikeDto);

	boolean check(BoardLikeDto boardLikeDto);
	int count(int boardNo);
}
