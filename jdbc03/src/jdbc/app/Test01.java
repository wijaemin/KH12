package jdbc.app;

import jdbc.dao.pocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test01 {
	public static void main(String[] args) {
		// 포켓몬스터 등록

		// 데이터

		PocketmonDto dto = new PocketmonDto();
		dto.setNo(55);
		dto.setName("얼씨구");
		dto.setType("절씨구");
//처리
		pocketmonDao dao = new pocketmonDao();
		dao.insert(dto);

		System.out.println("등록 완료");

	}
}
