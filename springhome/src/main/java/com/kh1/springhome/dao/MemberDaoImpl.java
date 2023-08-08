package com.kh1.springhome.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh1.springhome.dto.MemberDto;
import com.kh1.springhome.mapper.MemberMapper;

@Repository
public class MemberDaoImpl implements MemberDao {
@Autowired
private JdbcTemplate tem;
@Autowired
private MemberMapper memberMapper;
@Override
public void insert(MemberDto memberDto) {
	String sql ="insert into member(member_id,member_pw,member_nickname,"
			+ "member_email,member_contact,member_birth,"
			+ "member_post,member_addr1,member_addr2)"
			+ " values(?,?,?,?,?,?,?,?,?)";
	Object[] ob = {memberDto.getMemberId(),memberDto.getMemberPw(),memberDto.getMemberNick(),
			memberDto.getMemberEmail(),memberDto.getMemberContact(),memberDto.getMemberBirth(),
			memberDto.getMemberPost(),memberDto.getMemberAddr1(),memberDto.getMemberAddr2()};
	tem.update(sql,ob);
}
	 
}
