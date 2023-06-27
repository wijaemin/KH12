package random;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		Random r = new Random();
		double doubleCount = 0;
		System.out.println("이제부터 100번동안 주사위 2개를 던지겠습니다. ");
		for (int i = 0; i <= 99; i++) {
			int dice1 = r.nextInt(6);
			int dice2 = r.nextInt(6);
			if (dice1 == dice2) {
				System.out.println("더블");
				doubleCount++;
			} else {
				System.out.println("싱글");
			}
		}
		System.out.println("------------------종료------------------");
		System.out.println("지금 까지 나온 더블의 횟수는 : " + doubleCount + "회 입니다.");
		System.out.println("더블이 나올 평균은 : "+ doubleCount+"% 입니다.");
	}
}
