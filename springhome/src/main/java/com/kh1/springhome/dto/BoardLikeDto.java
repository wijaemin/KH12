package com.kh1.springhome.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardLikeDto {

	private String memberId;
	private int boardNo;
}
