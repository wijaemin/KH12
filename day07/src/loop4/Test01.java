package loop4;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// do - while 반복문
		// 먼저 실행하고 나서 반복을 결정해야하는 상황에서 쓰는 구문이다.
		// ex) 사용자에게 시험점수를 입력받아 출력하는 프로그램을 만드려고한다면

		Scanner sc = new Scanner(System.in);
		int score = 0;
		do {
			System.out.print("점수 입력 : ");
			score = sc.nextInt();
			// 실행할 코드 입력 ->사용자에게 점수를 입력받는 코드
		} while (score < 0 || score > 100); // 실행 조건을 입력 ->잘못된 점수를 입력하면?

		System.out.println("점수 =" + score);
	}
}
