package com.kh.spring17.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring17.dto.MemberDto;
import com.kh.spring17.vo.MemberVo;

@Repository
public interface MemberDao {


	
	List<MemberDto> listSerach(MemberVo vo);
	
}
