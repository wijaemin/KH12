package com.kh1.springhome.dto;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class BoardDto {

private int board_no,board_readcount, board_likecount,board_replycount;
private String board_writer, board_title,board_content;
private Date board_ctime,board_utime;
private String keyword;



}
