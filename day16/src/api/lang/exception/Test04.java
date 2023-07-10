package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// Test 02 예제에서 예외를 한번에 처리하는 방법

		try {// 플랜 A
			Scanner sc = new Scanner(System.in);
			System.out.println("금액 : ");
			int money = sc.nextInt();
			System.out.println("인원 : ");
			int people = sc.nextInt();

			sc.close();

			int price = money / people; // 1인당 금액
			int remain = money % people; // 자투리 금액

			System.out.println("1인당 내야할 금액은 ?" + price + "원 입니다.");
			System.out.println(remain + "원은 저희가 지원해 드려요");
		} catch (Exception e) {
			System.err.println("프로그램 작동 오류 발생");
		}

	}
}
