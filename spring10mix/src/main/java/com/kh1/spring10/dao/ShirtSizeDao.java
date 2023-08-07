package com.kh1.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh1.spring10.dto.ShirtSizeDto;
import com.kh1.spring10.mapper.ShirtSizeMapper;

@Repository
public class ShirtSizeDao {

	@Autowired
	ShirtSizeMapper mapper;

	@Autowired
	JdbcTemplate tem;

	public void insert(ShirtSizeDto dto) {
		String sql = "insert into shirt_size(shirt_no,shirt_size_name) " + "values(?,?)";
		Object[] ob = { dto.getShirt_no(), dto.getShirt_size_name() };
		tem.update(sql, ob);
	}
	
	public List<ShirtSizeDto> selectList(int shirt_no){
		String sql= "select * from shirt_size where shirt_no =?";
		Object[] ob ={shirt_no};
		return tem.query(sql, mapper,ob);
	}
	public boolean delete(int shirt_no) {
		String sql ="delete shirt_size where shirt_no =?";
		Object[] ob = {shirt_no};
		return tem.update(sql,ob) >0;
	}
	

}
