package input;

import java.util.Scanner;
//자동 임포트는 컨트롤+쉬프트+ 영어 O  키로 누른다

public class Test06 {
public static void main(String[] args) {
	//문자열 입력
	Scanner sc = new Scanner(System.in);
	
	String name = sc.next();
	String name2 = sc.nextLine(); //띄어쓰기 가능 
System.out.print("입력한 이름 = " + name2);		
	

	
	
	sc.close();
}
}
