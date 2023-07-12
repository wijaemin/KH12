package api.collection;

import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "제시어 : 자바";
		ArrayList<String> gameList = new ArrayList<String>();

		System.out.println(a);
		while (true) {
			String text = sc.next();

			boolean num = text.charAt(text.length()-1) == text.charAt(0);
			String regex = "^[가-힣]{2,6}$";
			boolean num2 = text.matches(regex);
			gameList.add(text);
			if (num = false || num2 ==false) {
				System.out.println("게임 오버!!");
				System.out.println(gameList);
				break;
			}
			text.trim();
			System.out.println("제시어  : " + text.charAt(text.length()-1) + "\n입력 : ");
		}

	}
}
