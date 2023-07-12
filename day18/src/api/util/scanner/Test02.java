package api.util.scanner;

import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
	// 결론 : next 계열의 명령 뒤에 nextLine을 쓸경우 비어있는 명령한개를 만들어야한다.
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("입력");
	String a =sc.next();
	
	System.out.println("입력");
	sc.nextLine(); //그냥 넥스트가 엔터까지의 범위를 인식 못하니까  엔터를 처리하기 위해 사용한다 
	String b =sc.nextLine();
	
	System.out.println("a ="+ a);
	System.out.println("b ="+ b);
	
	
}
}
