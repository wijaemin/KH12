package api.lang.string2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요 : ");
		String ID = sc.nextLine();
		String chaek = "^[a-z][a-z0-9\\-_]{4,19}$";
		boolean c = ID.matches(chaek);
		sc.close();
		if (c) {
			System.out.println("아이디 확인 완료");
		} else
			System.out.println("아이디 불가");
	}
	
}
