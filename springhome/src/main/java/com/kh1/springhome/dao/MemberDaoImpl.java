package com.kh1.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh1.springhome.dto.MemberDto;
import com.kh1.springhome.dto.StatDto;
import com.kh1.springhome.mapper.AdminListMapper;
import com.kh1.springhome.mapper.MemberMapper;
import com.kh1.springhome.mapper.StatMapper;
import com.kh1.springhome.vo.PaginationVO;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private JdbcTemplate tem;

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public void insert(MemberDto memberDto) {
		String sql = "insert into member(" + "member_id, member_pw, member_nickname, "
				+ "member_email, member_contact, member_birth, " + "member_post, member_addr1, member_addr2" + ") "
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] data = { memberDto.getMemberId(), memberDto.getMemberPw(), memberDto.getMemberNickname(),
				memberDto.getMemberEmail(), memberDto.getMemberContact(), memberDto.getMemberBirth(),
				memberDto.getMemberPost(), memberDto.getMemberAddr1(), memberDto.getMemberAddr2() };
		tem.update(sql, data);
	}

	@Override
	public MemberDto selectOne(String memberId) {
		String sql = "select * from member where member_id = ?";
		Object[] data = { memberId };
		List<MemberDto> list = tem.query(sql, memberMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public boolean updateMemberLogin(String memberId) {
		String sql = "update member set member_login=sysdate " + "where member_id = ?";
		Object[] data = { memberId };
		return tem.update(sql, data) > 0;

	}

	@Override
	public boolean updateMemberPw(String memberId, String changePw) {
		String sql = "update member " + "set member_pw=?, member_change=sysdate " + "where member_id = ?";
		Object[] data = { changePw, memberId };
		return tem.update(sql, data) > 0;
	}

	@Override
	public boolean updateMemberInfo(MemberDto memberDto) {
		String sql = "update member set member_nickname = ?, member_email= ?, "
				+ "member_contact =?, member_birth = ?, " + "member_post = ?, member_addr1 = ?, "
				+ "member_addr2 = ? where member_id = ? ";
		Object[] ob = { memberDto.getMemberNickname(), memberDto.getMemberEmail(), memberDto.getMemberContact(),
				memberDto.getMemberBirth(), memberDto.getMemberPost(), memberDto.getMemberAddr1(),
				memberDto.getMemberAddr2(), memberDto.getMemberId() };
		return tem.update(sql, ob) > 0;
	}

	@Override
	public boolean exit(String memberPw) {
		String sql = "delete from member where member_id = ?";
		Object[] ob = { memberPw };
		return tem.update(sql, ob) > 0;
	}

	@Override
	public boolean increaseMeberPoint(String memberId, int point) {
		String sql = "update member set member_point = member_point+? where member_id = ?";
		Object[] ob = { point, memberId };
		return tem.update(sql, ob) > 0;
	}

	@Override
	public boolean updateMemberInfoByAdmin(MemberDto memberDto) {
		String sql = "update member set " + "member_nickname =?, " + "member_contact =?, " + "member_email =?, "
				+ "member_birth =?, " + "member_post =?, " + "member_addr1 =?, " + "member_addr2 =?, "
				+ "member_level =?, " + "member_point =? " + "where member_id = ?";
		Object[] ob = { memberDto.getMemberNickname(), memberDto.getMemberContact(), memberDto.getMemberEmail(),
				memberDto.getMemberBirth(), memberDto.getMemberPost(), memberDto.getMemberAddr1(),
				memberDto.getMemberAddr2(), memberDto.getMemberLevel(), memberDto.getMemberPoint(),
				memberDto.getMemberId() };
		return tem.update(sql, ob) > 0;
	}

	@Override
	public MemberDto selectOneByNickname(String memberNickname) {
		String sql = "select * from member where member_nickname = ?";
		Object[] data = { memberNickname };
		List<MemberDto> list = tem.query(sql, memberMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}

	@Autowired
	private StatMapper statMapper;

	@Override
	public List<StatDto> selectGroupByMemberLevel() {
		String sql = "select member_level name, count(*) cnt from member " + "group by member_level "
				+ "order by cnt desc";
		return tem.query(sql, statMapper);
	}

	@Override
	public void insertProfile(String memberId, int attachNo) {
		String sql = "insert into member_profile values(?,?)";
		Object[] data = {memberId,attachNo};
		tem.update(sql, data);
	}

	@Override
	public boolean deleteProfile(String memberId) {
		String sql = "delete member_profile where member_id = ?";
		Object[] data = {memberId};
		return tem.update(sql,data)>0;

	}

	@Override
	public Integer findProfile(String memberId) {
		String sql = "select attach_no from member_profile "
				+ "where member_id = ?";
		Object[] data = {memberId};
		try {
			return tem.queryForObject(sql,Integer.class,data);
		}
		catch(Exception e) {
			return null;
		}
		
	}

}
