package loop2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구 단숫자 입력 : ");
		int number = sc.nextInt();
		int k = 0;
		int count = 0;
		int failCount = 0;
		int comboCount = 0;
		for (int i = 1; i <= 9; i++) {
			System.out.print(number + " X " + i + " = ");
			k = sc.nextInt();
			boolean ok = number * i == k;
			boolean fail = number * i != k;
			if (ok) {
				count++;
				while (count >= 2) {
					comboCount++;
					break;
				}
			} else {
				failCount++;
				comboCount = 0;
			}
		}
		sc.close();
		System.out.println("정답 : " + count + " 개");
		System.out.println("오답 : " + failCount + " 개");
		System.out.println("콤보 카운트의 수는 : " + comboCount + "개 입니다.");
	}
}
