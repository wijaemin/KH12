package loop3;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int count = 0;
		int num = r.nextInt(1000) + 1;

		while (true) {
			System.out.print("업다운 게임을 위한 숫자를 입력해주세요 : ");
			int ansser = sc.nextInt();
			System.out.println(num);
			count++;
			if (ansser < num) {
				System.out.println("업");
			} else if (ansser > num) {
				System.out.println("다운");
			} else {
				System.out.println("정답입니다.");
				break;
			}
		}
		sc.close();
		System.out.println("지금까지 걸린 총 횟수는 : " + count + "회 입니다.");
	}
}
