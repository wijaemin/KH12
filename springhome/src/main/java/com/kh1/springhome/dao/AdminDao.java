package com.kh1.springhome.dao;

import java.util.List;

import com.kh1.springhome.dto.MemberDto;
import com.kh1.springhome.vo.PaginationVO;


public interface AdminDao {
	public List<MemberDto> adminList();
	public MemberDto detail(String memberId);
	public List<MemberDto> selectList(String type,String keyword);
	int countList(PaginationVO vo);
	List<MemberDto>selectListByPage(PaginationVO vo);

}
