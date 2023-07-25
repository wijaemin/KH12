package jdbc.app;

import java.util.List;

import jdbc.dao.boardDao;
import jdbc.dto.boardDto;

public class Test16 {
public static void main(String[] args) {
	boardDao dao = new boardDao();
	List< boardDto> list = dao.selectList();
	for (boardDto dto : list) {
		System.out.println(dto);
	}
	int num = 5;
	boardDto dto = dao.selectOne(num);
	if ( dto ==null) {
		System.out.println("찾을수 없습니다.");
	}
	else {System.out.println(dto);}
}
}
