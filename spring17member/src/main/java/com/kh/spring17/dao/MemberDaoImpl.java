package com.kh.spring17.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring17.dto.MemberDto;
import com.kh.spring17.vo.MemberVo;

@Repository
public class MemberDaoImpl implements MemberDao {
@Autowired
SqlSession sqlsession;
	
	@Override
	public List<MemberDto> listSerach(MemberVo vo) {
List<MemberDto> list=	sqlsession.selectList("member.listSerach",vo);
		return list;
	}

}
