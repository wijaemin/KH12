package com.kh1.springhome.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kh1.springhome.dto.AttachDto;
import com.kh1.springhome.dto.PocketmonDto;

@Repository
public interface PocketmonDao {

	public int sequence();
	public void insert(PocketmonDto pocketmonDto);
	public PocketmonDto selectOne(int no);
	public List<PocketmonDto> selectList();
	public boolean delete(int no);
	
	public void connect(int pocketmonNo, int attachNo);
	public AttachDto findImage(int poketmonNo);
	
}
