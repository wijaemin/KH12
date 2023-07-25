package jdbc.app;

import java.util.List;

import jdbc.dao.boardDao;
import jdbc.dto.boardDto;

public class Test16_1 {
public static void main(String[] args) {
	//데이터
	int page = 1;
	
	//DB처리 
	boardDao dao = new boardDao();
	List<boardDto> list = dao.selectListByPage(page, page);
	
	for(boardDto dto : list) {
		System.out.print("["+dto.getBoard_no()+"]");
		System.out.println(dto.getBoard_title());
	}
}
}
