package com.kh1.springhome.dao;

import org.springframework.stereotype.Repository;

import com.kh1.springhome.dto.PocketmonDto;

@Repository
public interface PocketmonDao {

	public int sequence();
	public void insert(PocketmonDto pocketmonDto);
	public void connect(int pocketmonNo, int attachNo);
}
