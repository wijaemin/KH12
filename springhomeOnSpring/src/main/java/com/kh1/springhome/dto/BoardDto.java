package com.kh1.springhome.dto;


import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardDto {

	private int board_no, board_readcount, board_likecount, board_replycount;
	private String board_writer, board_title, board_content;
	private Date board_ctime, board_utime;
	private String keyword;
	private int  board_group, board_depth;
	private Integer board_parent ;
//작성자 출력용 메소드
	public String getBoardWriterString() {
		if (board_writer == null) {
			return "(탈퇴한 사용자)";
		} else {
			return board_writer;
		}
	}

//날짜에 따라 다른 값을 반환하는 메소드
public String getBoardCtimeString() {
	LocalDate current = LocalDate.now(); //현재날짜

	LocalDate ctime = board_ctime.toLocalDate(); //작성일
	if(ctime.equals(current))  //작성일이 ==오늘
	{
		Timestamp stamp =new Timestamp(board_ctime.getTime());
		LocalDateTime time =stamp.toLocalDateTime();
				LocalTime result=time.toLocalTime();
		return  result.format(DateTimeFormatter.ofPattern("HH:mm"));} //시간
	else { return ctime.toString();} //날짜
}

}
