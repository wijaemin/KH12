package condition;

import java.util.Scanner;

public class Test04 {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int pay = 100000;
	int discount = 25;
	System.out.print("고객님의 성함을 입력해주세요 : ");
	String name = sc.next();
	System.out.print("고객님의 핸드폰 번호를 입력해주세요 : ");
	String phoneNumber = sc.next();
	System.out.print("인원수를 입력해 주세요 : ");
	int people = sc.nextInt();
	System.out.print("몇 박을 여행가실지 입력해 주세요 : ");
	int day = sc.nextInt();
	System.out.print("가고 싶은 달을 입력해주세요 ex) 숫자만 입력해주세요 : ");
	int month = sc.nextInt();
	int totalPay = pay* people * day ;
	int eventPay = totalPay - (totalPay/discount);
	
	sc.close();
	
	if (month == 6 || month ==7 || month ==8) { 
		System.out.println("여름 이벤트로 할인하여 금액은 "+ eventPay  + "원 입니다." );
		
	}
	else {System.out.println("금액은 "+ totalPay +"원 입니다." );
	
	
}
}}
