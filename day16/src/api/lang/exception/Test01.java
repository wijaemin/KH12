package api.lang.exception;

import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	// 예외(exeception)
	//실행중 발생하는 돌발상황
	
	//ex)1/n 계산기
	
	Scanner sc =new Scanner(System.in);
	System.out.println("금액 : ");
	int money = sc.nextInt();
	System.out.println("인원 : ");
	int people = sc.nextInt();
	
	sc.close();
	
	int price = money / people; //1인당 금액
	int remain = money % people ; // 자투리 금액
	
	System.out.println("1인당 내야할 금액은 ?"+price +"원 입니다.");
	System.out.println(remain +"원은 저희가 지원해 드려요");
}
}
