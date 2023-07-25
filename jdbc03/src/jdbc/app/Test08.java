package jdbc.app;

import jdbc.dao.bookDao;
import jdbc.dto.bookDto;

public class Test08 {
	public static void main(String[] args) {
		bookDto dto = new bookDto();
		bookDao dao = new bookDao();
		dto.setBook_id(0);
		dto.setBook_price(0);
		boolean result = dao.updateBookPrice(dto);
		if (result)
			System.out.println("책 가격 수정 완료");
		else
			System.out.println("책 가격 수정 불가");

	}
}
