package com.kh.spring18.dao;

import javax.servlet.http.HttpSession;

import com.kh.spring18.dto.SecureMemberDto;

public interface SecureMemberDao {
	
 void insert(SecureMemberDto dto);
 

 SecureMemberDto selectOne(String memberId);
 SecureMemberDto login(SecureMemberDto dto);
}
