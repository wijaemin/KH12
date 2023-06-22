package condition;

import java.time.LocalDate;
import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 LocalDate now = LocalDate.now();
	 int nowYear = now.getYear();
	System.out.print("현재 당신의 출생년도를 입력해 주세요 : ");
	int year = sc.nextInt();
	int googbobPay = 7500;
	System.out.print("당신이 먹은 국밥 갯수를 입력하세요 : ");
	int googbob = sc.nextInt();
	int event = 30;
	int eventYear = nowYear - year +1 ;
	int pay = googbob * googbobPay ;
	int eventPay = pay - pay/event ;
	
	if (eventYear >=65) {
		System.out.print("이벤트로 30퍼센트 할인하여 총"+eventPay+ "원 나오셨습니다.");
		} 
	else {
		System.out.print("총 "+pay+ " 원 나왔습니다.");
	}
sc.close();
}}
