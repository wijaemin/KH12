package jdbc.app;

import jdbc.dao.boardDao;
import jdbc.dto.boardDto;

public class Test07 {
	public static void main(String[] args) {

		boardDto dto = new boardDto();
		boardDao dao = new boardDao();
		dto.setBoard_content("dasdasdsa");
		dto.setBoard_no(1);
		dto.setBoard_readcount(15);
		dto.setBoard_title("asdsadsa");
		dto.setBoard_writer("asdasasdsad");
		boolean result = dao.update(dto);
		if (result)
			System.out.println("수정완료");
		else
			System.out.println("수정되지 않음( 항목이 없다)");

	}
}
