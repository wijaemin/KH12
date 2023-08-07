package com.kh1.spring10.dao;

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
	

}
