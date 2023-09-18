package com.kh1.springhome.dao;


import org.springframework.stereotype.Repository;

import com.kh1.springhome.dto.CertDto;



public interface CertDao {

	void insert(CertDto certDto);
	boolean delete(String certEmail);
	boolean deleteOver5min();
	CertDto selectOne(String certEmail);
	CertDto selectOneIn5min(String certEmail);

}
