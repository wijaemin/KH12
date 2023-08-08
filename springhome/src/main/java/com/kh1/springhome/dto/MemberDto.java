package com.kh1.springhome.dto;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {

	private String memberId,memberPw,memberNick;
	private String memberEmail,memberContact;
	private String memberBirth;
	private String memberPost,memberAddr1,memberAddr2;
	private String memberLevel;
	private int memberPoint;
	private Date memberJoin,memeberLogin,memberChange;
}
