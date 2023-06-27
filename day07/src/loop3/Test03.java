package loop3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<주의> 0을 제외한 숫자를 입력해주시기 바랍니다.");
		int total = 0;
		int count = 0;
		while (true) {
			System.out.print("숫자를 입력해주세요 : ");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("0을 입력하셔서 이 프로그램을 종료합니다.");
				System.out.println("합계는 : " + total + " 입니다.");
				float aver = (float) total / count;
				System.out.println("평균은 : " + aver + " 입니다.");
				break;
			} else {
				total = num + total;
				count++;
			}
		}
		sc.close();
	}
}
