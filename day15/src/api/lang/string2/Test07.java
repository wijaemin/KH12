package api.lang.string2;

import java.util.Scanner;

public class Test07 extends Member {
	Test07(String memberld, String memberPw, String membername, String memberlevel, int memberPoint) {
		super(memberld, memberPw, membername, memberlevel, memberPoint);
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 아이디를 입력하세요 ");
		String ID = sc.next();
		String IDcheak ="^[a-zA-Z0-9]{8,20}$";
		System.out.println("회원 비밀번호를 입력하세요 ");
		String pw = sc.next();
		String pwcheak ="^[a-zA-Z0-9!@#$%^&*]{8,15}$";
		System.out.println("회원 이름를 입력하세요 ");
		String name = sc.next();
		String namecheak ="^[가-힝]{2,5}$";
		System.out.println("회원 레벨를 입력하세요 ");
		String level = sc.next();
		System.out.println("회원 포인트를 입력하세요 ");
		int point = sc.nextInt();
	

		Member a = new Member(ID, pw, name, level, point);
		
		a.show();
	}
}
