package api.lang.exception;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("출생년도를 입력헤주세요 \nex) YYYY-MM-DD");
			String b = sc.next();
			sc.close();

			int year = Integer.parseInt(b.substring(0, 4));
			int mon = Integer.parseInt(b.substring(5, 7));
			int day = Integer.parseInt(b.substring(8, 10));
			System.out.println("출생년도 : " + year + "년");
			System.out.println("출생월 : " + mon + "월");
			System.out.println("출생일 : " + day + "일");
			
		} catch (NumberFormatException e) {
			System.err.println("한글 또는 특수문자 입력 하시면 안됩니다.");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.err.println("범위를 벗어 났습니다.");
		}
	}
}
