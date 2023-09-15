package com.kh1.springhome.dao;

import org.springframework.stereotype.Repository;

import com.kh1.springhome.dto.AttachDto;

@Repository
public interface AttachDao {
	int sequence();

	public void insert(AttachDto attachDto);

	public boolean delete(int attachNo);

	public AttachDto selectOne(int attachNo);
}
