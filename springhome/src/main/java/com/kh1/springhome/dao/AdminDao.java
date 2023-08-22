package com.kh1.springhome.dao;

import java.util.List;

import com.kh1.springhome.dto.MemberBlockDto;
import com.kh1.springhome.dto.MemberDto;
import com.kh1.springhome.dto.MemberListDto;
import com.kh1.springhome.vo.PaginationVO;


public interface AdminDao {
	public List<MemberDto> adminList();
	public MemberDto detail(String memberId);
	public List<MemberDto> selectList(String type,String keyword);
	int countList(PaginationVO vo);
	List<MemberDto>selectListByPage(PaginationVO vo);
	List<MemberListDto>selectListByPage2(PaginationVO vo);
	
	// 차단+해제 기능
		void insertBlock(String memberId);
		boolean deleteBlock(String memberId);
		List<MemberBlockDto>selectBlockList();
		MemberBlockDto selectBlockOne(String memberId);
}
