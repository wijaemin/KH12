package api.lang.string;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메세지 출력 : ");
		String a = sc.nextLine();

		String star = "*";
		String[] fuck = new String[] { "수박씨", "신발끈", "개나리", "십장생", "시베리아" };
		for (int i = 0; i < fuck.length; i++) {
			int count =fuck[i].length();
		//	a = a.replace(fuck[i],star.repeat(count)); 글자수에따른 별 갯수 코드
			a = a.replace(fuck[i],"***");
		}
		System.out.println(a);
	}
}
