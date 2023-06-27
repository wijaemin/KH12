package loop3;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		int castle = 100;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("지금부터 모래성 땅따먹기를 시작하겠습니다.");
		while (true) {
			System.out.print("숫자를 입력해주세요 : ");
			int ansser = sc.nextInt();
			castle = castle - ansser;
			count++;
			if (castle <= 0) {
				System.out.println("게임 오버");
				System.out.println("지금까지 총 " + count + "의 숫자 만큼 입력하셨습니다.");
				break;
			}
		}
	}
}
