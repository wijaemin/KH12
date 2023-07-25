package jdbc.app;

import jdbc.dao.pocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test14 {
	public static void main(String[] args) {
		// 포켓몬스터 번호를 이용하여 상세조회

		// 데이터
		int no = 999;
		pocketmonDao dao = new pocketmonDao();
		PocketmonDto dto = dao.selectOne(no);

		// 출력
		if (dto == null) {
			System.out.println("찾으시는 몬스터가 없어요");
		} else {
			System.out.println(dto);
			System.out.println(dto.getName());
			System.out.println(dto.getType());
		}
	}
}
