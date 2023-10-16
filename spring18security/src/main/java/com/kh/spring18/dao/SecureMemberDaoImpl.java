package com.kh.spring18.dao;


import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.kh.spring18.dto.SecureMemberDto;

@Repository
public class SecureMemberDaoImpl implements SecureMemberDao {

	@Autowired 
	private SqlSession sqlsession;

	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Override
	public void insert(SecureMemberDto dto) {
		//dto에 들어있는 비밀번호를 암호화 처리 한뒤 등록
		String origin = dto.getMemberPw();

		String encrypt = encoder.encode(origin);
		dto.setMemberPw(encrypt);
				
		sqlsession.insert("secureMember.join",dto);
		
	}

	@Override
	public void login(SecureMemberDto dto, String memberId, HttpSession session) {
		
			if(	sqlsession.selectList("secureMember.selectOne",memberId) !=null) {
				String inputPw = dto.getMemberPw();
				SecureMemberDto findDto = new SecureMemberDto();
				String findPw=findDto.getMemberPw();
				
				boolean result = encoder.matches(inputPw, findPw); 
			if(result) {
			 session.setAttribute("memberId", dto.getMemberId());
			 session.setAttribute("memberPw", dto.getMemberPw());
			}
			else {
				
			}
			}
	
	
		
	
	}
}
