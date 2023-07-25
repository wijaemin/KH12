package jdbc.app;

import java.util.Scanner;

import jdbc.dao.bookDao;
import jdbc.dto.bookDto;

public class Test21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 게시글의 번호를 입력해주세요 : ");
		int num = sc.nextInt();
		bookDao dao = new bookDao();
		bookDto dto = dao.selectOne(num);
		if (dto == null) {
			System.out.println("입력하신 게시글 번호를 찾을수 없습니다.");
		} else {
			System.out.println("찾았습니다.\n 제공해 드리겠습니다.");
			System.out.println(dto);
		}
	}
}
