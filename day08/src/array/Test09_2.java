package array;

import java.util.Random;

public class Test09_2 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] countList = new int[6]; //45까지의 배열

		for (int i = 0; i < 100; i++) { //1000번까지의 출력
			int lotto = r.nextInt(6) + 1; //1부터 45까지 출력
			countList[lotto - 1]++;
			

		}
		for (int i = 0; i < countList.length; i++) {
			System.out.println((i + 1) + "이 나온 횟수는 ? " + countList[i]);

		}
	}
}