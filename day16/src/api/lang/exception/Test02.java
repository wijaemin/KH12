package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
	// 예외(exeception) 처리 구분


	try {//플랜 A
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
	catch (ArithmeticException e) {
		//플랜 1 인원수를 0으로 입력했을때
		System.err.println("인원수는 0일수 없습니다.");
	}
	catch (InputMismatchException e) {
		// 플랜2 입력을 잘못했을때
		System.err.println("입력을 숫자로 하세요");
	}
}
}
