package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> gameList = new ArrayList<String>();

		while (true) {
			System.out.println("나라를 입력해주세요");
			String nara = sc.next();
			if (gameList.contains(nara)) {
				System.out.println("게임 오버");
				break;
			}
			else {gameList.add(nara);}

		}
		sc.close();
		System.out.println(gameList);
		System.out.println(gameList.size());

	}
}
