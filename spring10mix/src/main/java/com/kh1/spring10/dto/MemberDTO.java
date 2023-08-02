package com.kh1.spring10.dto;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDTO {
	private String memberId;
	private String memberPw;
	private String memberNickname;
	private String memberEmail;
	private String memberBirth;
	private String memberContact;
	private String memberLevel;
	private int memberPoint;
	private Date memberJoin;
}
