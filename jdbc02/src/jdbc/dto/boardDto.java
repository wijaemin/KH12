package jdbc.dto;

public class boardDto {
private int  board_no, board_readcount;
private  String board_title, board_writer, board_content;
public boardDto() {
	super();
}
@Override
public String toString() {
	return "boardDto [board_no=" + board_no + ", board_readcount=" + board_readcount + ", board_title=" + board_title
			+ ", board_writer=" + board_writer + ", board_content=" + board_content + "]";
}
public int getBoard_no() {
	return board_no;
}
public void setBoard_no(int board_no) {
	this.board_no = board_no;
}
public int getBoard_readcount() {
	return board_readcount;
}
public void setBoard_readcount(int board_readcount) {
	this.board_readcount = board_readcount;
}
public String getBoard_title() {
	return board_title;
}
public void setBoard_title(String board_title) {
	this.board_title = board_title;
}
public String getBoard_writer() {
	return board_writer;
}
public void setBoard_writer(String board_writer) {
	this.board_writer = board_writer;
}
public String getBoard_content() {
	return board_content;
}
public void setBoard_content(String board_content) {
	this.board_content = board_content;
}

}
