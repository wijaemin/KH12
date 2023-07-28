package com.kh.spring08.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.kh.spring08.DTO.MemberDTO;
import com.kh.spring08.Mapper.MemberMapper;

@Repository
public class MemberDAO {
	@Autowired
	JdbcTemplate tem;
	@Autowired
	MemberMapper mapper;

	public void join(MemberDTO dto) {
		String sql = "insert into member(member_id,member_pw,member_nickname,member_brith,member_email,"
				+ "member_contact,member_level,member_point,member_join)" + " values(?,?,?,?,?,?,'일반',0,sysdate)";
		Object[] ob = { dto.getMemberID(), dto.getMemberPW(), dto.getMemberNickname(), dto.getMemberBrith(),
				dto.getMemberEmail(), dto.getMemberContact() };
		tem.update(sql, ob);
	}

	public boolean exit(String id) {
		String sql = "delete * from member where member_id = ?";
		Object[] ob = { id };
		return tem.update(sql, ob) > 0;
	}

	public boolean change(MemberDTO dto) {
		String sql = "update member set member_nickname = ?, member_brith =?, member_email= ?,"
				+ "member_contact = ? where member_id = ? ";
		Object[] ob = { dto.getMemberNickname(), dto.getMemberBrith(), dto.getMemberEmail(), dto.getMemberContact(),
				dto.getMemberID() };
		return tem.update(sql, ob) > 0;
	}

	public List<MemberDTO> list() {
		String sql = "select * from member order by member_id asc";
		return tem.query(sql, mapper);
	}

	public MemberDTO detail(String ID) {
		String sql = "select * from member where member_id =?";
		Object[] ob = { ID };
		List<MemberDTO> list = tem.query(sql, mapper, ob);
		return list.isEmpty() ? null : list.get(0);
	}

	public boolean password(MemberDTO dto) {
		String sql = "update member set member_pw = ? where member_id = ?";
		Object[] ob = { dto.getMemberPW(), dto.getMemberID() };
	return tem.update(sql, ob)>0;
		
	}
}
