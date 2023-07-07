package api.lang.string;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ID = "khacademy";
		String passWord = "student1234";
		System.out.print("아이디를 입력해 주세요 :  ");
		String a = sc.next();
		System.out.print("비밀번호를 입력해 주세요 :  ");
		String b = sc.next();
		sc.close();
		if (ID.equalsIgnoreCase(a)  && passWord.equals(b)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}

	}
}
