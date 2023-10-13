package com.kh.spring17.vo;

import java.sql.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberVo {
	 private String memberId, memberPw,memberNickname
	 ,memberAddr1,memberAddr2,memberBirth,
	 memberLoginStart, memberLoginEnd, memberJoinStart,
	 memberJoinEnd, memberChangeStart, memberChangeEnd,memberEmail;
	 
	 private Integer memberContact,memberPost,memberPoint;
		
		
		private 	List<String> orderList,memberLevelList;
}
