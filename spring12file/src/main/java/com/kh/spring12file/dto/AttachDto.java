package com.kh.spring12file.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class AttachDto {

	private String attachName , attachType;
	private int attachNo;
	private Date attachTime;
	private long attachSize;
}
