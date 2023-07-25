package jdbc.app;

import java.util.List;

import jdbc.dao.memberDao;
import jdbc.dto.memberDto;

public class Test18 {
	public static void main(String[] args) {
		memberDao dao = new memberDao();
		int page = 0;
		int size = 20;
		List<memberDto> list = dao.selectTen(page);
		if (list.isEmpty()) {
			System.out.println("항목이 없습니다.");
		}
		for (memberDto dto : list) {
			System.out.println(dto);
		}
	}
}
