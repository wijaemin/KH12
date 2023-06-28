package array;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] conty = new String[5];
		System.out.println("나라를 입력해주세요 ");
		for (int i = 0; i < conty.length; i++) {
			conty[i] = sc.nextLine();
		}
		for (int i = 0; i < conty.length; i++) {
			System.out.print("나라 이름 : ");
			System.out.println(conty[i]);

		}
	}
}
