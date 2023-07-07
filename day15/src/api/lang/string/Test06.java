package api.lang.string;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "바나나";
		while (true) {
			System.out.println(a +" 쿵쿵따!");
			String b = sc.next();

			if (a.charAt(2) == b.charAt(0) && a.length() == 3) {
				System.out.println("정답");
				a = b;

			} else {
				System.out.println("게임 오버!");
				break;
			}
		}
		sc.close();
	}

}
