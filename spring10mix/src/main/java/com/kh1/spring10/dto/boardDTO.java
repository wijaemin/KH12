package com.kh1.spring10.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class boardDTO {

	private int board_no, board_readcount;
	private String board_title, board_content, board_writer;
}
