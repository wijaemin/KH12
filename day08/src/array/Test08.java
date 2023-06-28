package array;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int otherNum = 75;
		int rank = 1;
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "번 학생 점수를 입력해주세요 :  ");
			num[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 90) {
				System.out.println(i + 1 + "번 학생 축하합니다. 성적을 우수하게 받으셨습니다.");
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 60) {
				System.out.println(i + 1 + "번 학생 아쉽네요. 다음에 다시 응시해 주세요");
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] > otherNum) {rank++;}}
		System.out.println("전학생의 등수는 ? " + rank + "등 입니다.");
	}
	}
