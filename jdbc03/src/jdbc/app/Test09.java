package jdbc.app;

import jdbc.dao.bookDao;
import jdbc.dto.bookDto;

public class Test09 {
	public static void main(String[] args) {
		bookDao dao = new bookDao();
		bookDto dto = new bookDto();
		dto.setBook_author("asdsad");
		dto.setBook_id(1);
		dto.setBook_publisher("asdasdsa");
		dto.setBook_title("asdsadsa");
		boolean result = dao.updateBookInfo(dto);
		if (result)
			System.out.println("책 정보 수정 완료");
		else
			System.out.println("책 정보 수정 불가");

	}
}
