package jdbc.app;

import java.util.Scanner;

import jdbc.dao.bookDao;
import jdbc.dto.boardDto;
import jdbc.dto.bookDto;

public class Test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하실 책의 번호를 알려주세요 : ");
		int num = sc.nextInt();
		bookDao dao = new bookDao();
		bookDto dto = dao.selectOne(num);
		if (dto == null) {
			System.out.println("입력하신 책의 번호를 찾을수 없습니다.");
		} else {
			System.out.println("입력하신 책을 찾았습니다. \n제공해드리겠습니다.");
			System.out.println(dto);
		}
	}
}
