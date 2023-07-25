package jdbc.app;

import java.util.List;

import jdbc.dao.bookDao;
import jdbc.dto.bookDto;

public class Test15 {
	public static void main(String[] args) {
		bookDao dao = new bookDao();
		List<bookDto> list = dao.selectList();
		System.out.println("총 "+list.size()+"개의 데이터가 있습니다.");
		for (bookDto dto : list) {
			System.out.print("["+dto.getBook_id()+"]");
			System.out.println("\t"+dto.getBook_title());
		}
		int num = 1;
		bookDto dto = dao.selectOne(num);
		if (dto == null) System.out.println("없는 항목 입니다.");
		else
			System.out.println("찾았어요 ! \n" +dto);
		
	}
}
