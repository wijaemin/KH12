package random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("<윳놀이 시작!>");
		int a = r.nextInt(16);
		if (a < 4) {
			System.out.println("도가 나왔습니다.");
		} else if (a < 10 && a >= 4) {
			System.out.println("개가 나왔습니다.");
		} else if (a >= 10 && a < 14) {
			System.out.println("걸이 나왔습니다.");
		} else if (a == 15) {
			System.out.println("윳이 나왔습니다.");
		} else if (a == 16) {
			System.out.println("모가 나왔습니다.");
		} else if (a == 0) {
			System.out.println("빽도가 나왔습니다.");
		} else {
		}
	}
}
