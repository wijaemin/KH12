package jdbc.app;

import java.sql.Date;
import java.util.Scanner;

import jdbc.dao.memberDao;
import jdbc.dto.memberDto;

public class Test11 {
	public static void main(String[] args) {
		memberDao dao = new memberDao();
		memberDto dto = new memberDto();
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 아이디를 입력해주세요 : ");
	String a = sc.next();
	dto.setMember_id(a);
	System.out.print("회원 비밀번호를 입력해주세요 : ");
	String b = sc.next();	
	dto.setMember_pw(b);
	System.out.print("변경할 닉네임를 입력해주세요 : ");
	String c = sc.next();
	dto.setMember_nickname(c);
	System.out.print("변경할 전화번호를 입력해주세요 : ");
	int g = sc.nextInt();
	dto.setMember_contact(g);
	System.out.print("변경할 이메일을 입력해주세요 : ");
	String e = sc.next();		
	dto.setMember_email(e);
	System.out.print("변경할 생년월일을 입력해주세요 : ");
	String f = sc.next();	
	dto.setMember_birth(Date.valueOf(f));
		boolean result = dao.updateMemberInfo(dto);
		if (result)
			System.out.println("회원정보 변경 성공");
		else
			System.out.println("존재하지 않는 아이디입니다.");

	}
}
