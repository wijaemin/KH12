package loop2;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount = 0;
		int count = 0;
		int plusCount = 0;
		int total= 0;
		for (int k = 0; k < 10; k++) {
			System.out.print("숫자를 를 입력해주세요 : ");
			int num = sc.nextInt();
			if (num % 2 != 0) {
				count++;
			} else {
				plusCount++;
			}
			total+=num;
		}
		sc.close();
		System.out.println("홀수의 개수는 ? " + count);
		System.out.println("짝수의 개수는 ? " + plusCount);
		 System.out.println("전체 합계는 ? " + total);
		 System.out.println("전체 평균은 ? " + total/ 10);

	}
}