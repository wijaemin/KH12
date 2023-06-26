package loop2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		System.out.println(count + "숫자");
		if (count == 2) {
			System.out.println("소수 출력");
		} else {
			System.out.println("소수아님");
		}
	}
}
