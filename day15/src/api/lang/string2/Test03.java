package api.lang.string2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {

		// 정규 표현식(REGular EXpressoin)
		Scanner sc = new Scanner(System.in);
		System.out.println("전화 번호 입력해주세요 : ");
		String num = sc.nextLine();


		String check = "^01[016-9][1-9][0-9]{2,3}[0-9]{4}$";

		// boolean isnum = Pattern.matches(check, num);
		boolean isnum = num.matches(check);// 이게 더편함

		if (isnum=true) {
			System.out.println("전화번호 맞습니다.");
		} else {
			System.out.println("전화번호 틀렸습니다.");
		}
		sc.close();
	}
}
