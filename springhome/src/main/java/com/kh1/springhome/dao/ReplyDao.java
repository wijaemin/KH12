package com.kh1.springhome.dao;

import com.kh1.springhome.dto.ReplyDto;

public interface ReplyDao {
	
int sequence();

public void insert(ReplyDto replayDto);

}
