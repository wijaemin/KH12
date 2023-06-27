package random;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int missCount = 0;
		for (int i = 1; i <= 10; i++) {
			int num = r.nextInt(8) + 2;
			int num2 = r.nextInt(8) +2;
			System.out.print(num + "X" + num2 + "=");
			int q = sc.nextInt();
			if (num * num2 == q) {
				System.out.println("정답");
				count++;
			} else {
				System.out.println("오답");
				missCount++;
			}
		}
		sc.close();
		System.out.println("정답 갯수는 : " + count + "개 입니다.");
		System.out.println("오답 갯수는 : " + missCount + "개 입니다.");
	}
}
