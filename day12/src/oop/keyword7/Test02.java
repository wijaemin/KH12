package oop.keyword7;

import java.util.Random;

public class Test02 {
	//어디서나 객체없이 변하지않는 값을 사용하겟다 = 상수
	final static int scissors = 0;
	final static int rock = 1;
	final static int paper = 2;

	public static void main(String[] args) {
		// 상수(constant)의 필요성?
		// ex)가위바위보 출력

		// 약속 가위(0), 바위(1), 보(2)
		Random r = new Random();

		int choice = r.nextInt(3);
		System.out.println("선택은 ? " + choice);
		switch (choice) {
		case scissors:
			System.out.println("가위");
			break;
		case rock:
			System.out.println("바위");
			break;
		case paper:
			System.out.println("보");
			break;
		}

	}
}
