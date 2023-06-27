package loop3;

import java.util.Random;

public class q1 {
	public static void main(String[] args) {
		Random r = new Random();
		int item = 0;
		int count = 0;
		int pay = 1000;
		int k = item;
		while (true) {
			int gangHwa = r.nextInt(10) + 1;
			count++;
			if (gangHwa <= 2) {
				System.out.println("강화 성공");
				item++;
			} else if (gangHwa >= 3 && gangHwa <= 8) {
				System.out.println("강화 유지");
			} else if (item == 15) {
				System.out.println("풀강 완료");
				break;
			} else {
				System.out.println("강화 실패");
				item--;
			}
			System.out.println("지금 까지 강화 횟수는 : " + count + "회 입니다.");
			System.out.println("강화에 소모된 골드는 : " + (count * pay) + "골드 입니다.");
		}
	}
}
