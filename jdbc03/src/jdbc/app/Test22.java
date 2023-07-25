package jdbc.app;

import java.util.Scanner;

import jdbc.dao.memberDao;
import jdbc.dto.memberDto;

public class Test22 {
	public static void main(String[] args) {
		memberDao dao = new memberDao();
		Scanner sc = new Scanner(System.in);
		System.out.print("조회하실 아이디를 입력해주세요 : ");
		String ID = sc.next();
		memberDto dto = dao.selectOne(ID);
		if (dto == null) {
			System.out.println("아이디를 찾을수 없습니다.");
		} else {
			System.out.println("아이디를 찾았습니다.\n항목을 제공해 드리겠습니다.");
			System.out.println(dto);
		}
	}
}
