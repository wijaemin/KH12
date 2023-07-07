package api.lang.string;

import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해 주세요 : ");
		String ID = sc.next();
		
		if(ID.length() <=2 || ID.length()>=10  ||  ID.startsWith("운영자")) {System.out.println("로그인 실패");
	}else {
		System.out.println("로그인 성공");
	}
	}
}
