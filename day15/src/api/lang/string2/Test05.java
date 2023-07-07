package api.lang.string2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생년 월일을 입력 해주세요 : ");
		String date = sc.nextLine();
		sc.close();
		String cheak1 = "[12][09][0-9]{2}[01][0-9][012][0-9]"; //2월에 쓸용도
		String cheak = "[12][09][0-9]{2}[01][0-9][0123][0-9]"; //모든달에 쓸수잇음

		if (date.charAt(4) == 0 && date.charAt(5) == 2 && Pattern.matches(cheak1, date)) {

			System.out.println("작은달 구분완료!! 생년월일 정상 확인");
		} else if (Pattern.matches(cheak, date)) {
			System.out.println("생년월일 정상 확인");
		} else {
			System.out.println("생년월일 불량!!!");
		}
	}
}
