package jdbc.app;

import jdbc.dao.bookDao;
import jdbc.dto.bookDto;

public class Test03 {
public static void main(String[] args) {
	bookDto  dto = new bookDto();
	dto.setBook_author(null);
	dto.setBook_genre(null);
	dto.setBook_id(0);
	dto.setBook_page_count(0);
	dto.setBook_price(0);
	dto.setBook_publication_date(null);
	dto.setBook_publisher(null);
	dto.setBook_title(null);
	bookDao dao = new bookDao();
	dao.insert(dto);
}
}
