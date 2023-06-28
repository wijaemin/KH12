package array;

import java.util.Random;

public class Test09 {
	public static void main(String[] args) {
		Random r = new Random();
		int count = 0;
		int[] rotto = new int[6]; // 로또의 배열
		// for (int i = 0; i < 6; i++) {
		// int num = r.nextInt(45) + 1; // 로또의 랜덤 숫자
		// rotto[0] = 6;
		// rotto[i] = num; // 로또의 코드
		// System.out.println(rotto[i]);

		for (int k = 0; k < 1000; k++) {
			int num = r.nextInt(45) + 1;
			rotto[0] = num;
			rotto[1] = num;
			rotto[2] = num;
			rotto[3] = num;
			rotto[4] = num;
			rotto[5] = num;

			for (int i = 0; i < 6; i++)
				if (rotto[i] == 1) {
					count++;
				}
		}
		System.out.println("1의 숫자는 지금까지 " + count + "번 나왔습니다.");
		count = 0;
			}
	}

