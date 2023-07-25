package jdbc.app;

import jdbc.dao.pocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test06 {
	public static void main(String[] args) {
		// 포켓몬 정보 수정

		// 데이터 준비 - DTO
		PocketmonDto dto = new PocketmonDto();
		dto.setNo(3);
		dto.setName("이상해꽃");
		dto.setType("독");

		pocketmonDao dao = new pocketmonDao();
		boolean result = dao.update(dto);

		if (result)
			System.out.println("변경완료");
		else
			System.out.println("존재하지 않는 몬스터 번호");
	}
}
