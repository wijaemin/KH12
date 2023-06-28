package array;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("숫자를 불러주세요");
		for (int i = 0; i < num.length; i++) {
			
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
