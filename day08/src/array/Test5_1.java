package array;

import java.util.Scanner;

public class Test5_1 {
	public static void main(String[] args) {
		// 배열과 반복문
		// ex) 3개의 숫자를 입력받아서 출력, 합계 구하기
		int[] data = new int[3];
		// data --------> [ 0 ] [ 0 ] [ 0 ]
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력하세요. ");
		for (int i = 0; i <= 2; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("숫자를 출력합니다.");
		for (int i = 0; i <= 2; i++) {
			System.out.println(data[i]);
		}

	}
}
