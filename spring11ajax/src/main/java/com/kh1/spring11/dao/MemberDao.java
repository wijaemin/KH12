package com.kh1.spring11.dao;

import java.util.List;

import com.kh1.spring11.dto.MemberDto;


//메소드	명세만 작성(책으로치면 목차)
public interface MemberDao {
	
	void insert(MemberDto memberDto);

	MemberDto selectOne(String memberId);
	
	MemberDto selectNick(String memberNickname);

	boolean updateMemberLogin(String memberId);
		
	boolean updateMemberPw(String memberId,String changePw);
	 
	boolean updateMemberInfo(MemberDto memberDto);
	
	//관리자용 회원 정보 수정 메소드
	boolean updateMemberInfoByAdmin(MemberDto memberDto);
	
	boolean exit(String memberPw);
	
	boolean increaseMeberPoint(String memberId,int point);
//	boolean decreaseMeberPoint(String memberId,int point);
	

}
