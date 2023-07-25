package jdbc.app;

import java.util.Scanner;

import jdbc.dao.memberDao;
import jdbc.dto.memberDto;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		memberDto dto = new memberDto();
		memberDao dao = new memberDao();
		System.out.print("아이디를 입력해주세요 : ");
		String a = sc.next();
		System.out.print("기존 비밀번호를 입력해주세요 : ");
		String b = sc.next();
		System.out.print("변경할 비밀번호를 입력해주세요 : ");
		String c = sc.next();
		System.out.print("변경할 다시 비밀번호를 입력해주세요 : ");
		String d = sc.next();
		if (c.equals(d)) {
			dto.setMember_id(a);
			dto.setMember_pw(b);
			boolean result = dao.updateMemberPassword(dto);
			if (result)
				System.out.println("비밀번호 교체 성공");
			else
				System.out.println("비밀번호 교체 실패");
		}
	}
}
