package com.kh1.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh1.springhome.dto.BoardListDto;
import com.kh1.springhome.dto.MemberDto;
import com.kh1.springhome.mapper.AdminListMapper;
import com.kh1.springhome.vo.PaginationVO;


@Repository
public class AdminDaoImpl implements  AdminDao {
@Autowired
JdbcTemplate tem;
@Autowired
AdminListMapper adminListMapper;

@Override
public List<MemberDto> adminList() {
	String sql = "select * from member order by member_id asc";

	return tem.query(sql, adminListMapper);
}

@Override
public MemberDto detail(String memberId) {
	String sql = "select * from member where member_id =?";
	Object[] ob = {memberId};
   List<MemberDto>list = tem.query(sql,adminListMapper,ob);
 return list.isEmpty() ? null: list.get(0);
}

@Override 
public List<MemberDto> selectList(String type,String keyword) {
	String sql= "select * from member where instr("+type+", ?) > 0" 
			+ " order by member_id asc";

	Object[] ob = { keyword };
	List<MemberDto> list = tem.query(sql, adminListMapper, ob);
	return list;
}

@Override
public int countList(PaginationVO vo) {
	if(vo.isSearch()) {
		String sql = "select count(*) from member "
						+ "where instr("+vo.getType()+", ?) > 0";
		Object[] ob = {vo.getKeyword()};
		return tem.queryForObject(sql, int.class, ob);
	}
	else {
		String sql = "select count(*) from member";
		return tem.queryForObject(sql, int.class);
	}
}

public List<MemberDto> selectListByPage(PaginationVO vo) {
	if(vo.isSearch()) {
		String sql = "select * from ("
							+ "select rownum rn, TMP.* from ("
								+ "select * from member "
								+ "where instr("+vo.getType()+", ?) > 0 "
//								+ "order by member_id asc";
								+ "order by "+vo.getType()+" asc"
							+ ")TMP"
						+ ") where rn between ? and ?";
		Object[] data = {vo.getKeyword(), vo.getStartRow(), vo.getFinishRow()};
		return tem.query(sql, adminListMapper, data);
	}
	else {
		String sql = "select * from ("
							+ "select rownum rn, TMP.* from ("
								+ "select * from member order by member_id asc"
							+ ")TMP"
						+ ") where rn between ? and ?";
		Object[] data = {vo.getStartRow(), vo.getFinishRow()};
		return tem.query(sql, adminListMapper, data);
	}
}
}
