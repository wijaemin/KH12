package com.kh.spring12file.dao;

import org.springframework.stereotype.Repository;

import com.kh.spring12file.dto.AttachDto;

@Repository
public interface AttachDao {
	
int sequence();
public void  insert (AttachDto attachDto);
public AttachDto selectOne(int attachNo);
}
