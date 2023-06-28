package array;

import java.util.Scanner;

public class Test5_2 {
	public static void main(String[] args) {
		// 배열과 반복문
		// ex) 3개의 숫자를 입력받아서 출력, 합계 구하기
		// 배열에 크기가 정해지면 자동으로 length라는 버튼이 생긴다.
		int[] data = new int[10];
		// data -------->  (length =3)
		System.out.println(data.length);
		// data --------> [ 0 ] [ 0 ] [ 0 ]
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 " + data.length+"개를 입력하세요. ");
		for (int i = 0; i <data.length; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("숫자를 출력합니다.");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

	}
}
