package jdbc.app;

import jdbc.dao.boardDao;
import jdbc.dto.boardDto;

public class Test02 {
	public static void main(String[] args) {
		boardDto dto = new boardDto();
		boardDao dao = new boardDao();
		dto.setBoard_no(0);
		dto.setBoard_content("null");
		dto.setBoard_readcount(0);
		dto.setBoard_title("null21asd");
		dto.setBoard_writer("null");
		dao.insert(dto);
		System.out.println("등록완료");

	}
}
