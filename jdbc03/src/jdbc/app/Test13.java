package jdbc.app;

import java.util.List;

import jdbc.dao.pocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test13 {
	public static void main(String[] args) {
		// 저장된 포켓몬스터를 모두 불러오겟다.
		pocketmonDao dao = new pocketmonDao();
		List<PocketmonDto> list = dao.selectList();

		// 리스트를 활용해서 하고싶은 작업을 하면된다(반복문, 조건, 출력)
		System.out.println("조회 결과 수 : " + list.size());
		for (PocketmonDto dto : list) {
			System.out.println(dto);
		}

	}
}
