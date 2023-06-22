package input;

import java.util.Scanner;
//import java.util.*; // 전체 다 불러오기 기능 귀차니즘용
public class Test02 {
public static void main(String[] args) {
	// Scanner 도구를 이용한 입력 예제
	// 사용자가 입력한 글자를 모아서 원하는 형태로 반환하는 도구 
	// 기본 제공 도구가 아니므로 생성하여 사용한다.
	
	
	//스캐너 생성코드
	Scanner sc = new Scanner(System.in);
	//String a = "Hello"; 
	int a = sc.nextInt();//숫자를 알아서 입력받아 a에 저장해  라는 의미
	System.out.println("a =" + a);
	int b = sc.nextInt();
	System.out.println("b =" + b);
	long c = sc.nextLong();
	System.out.println("c =" + c);
	float d = sc.nextFloat();
	System.out.println("d =" + d);
	double f = sc.nextDouble();
	System.out.println("f =" + f);
	
	// 다썻으면 정리 해야한다
	sc.close();
	
	
}
}
