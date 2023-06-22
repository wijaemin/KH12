package output;

public class Test01 {
public static void main(String[] args) {
	// 출력 : CPU를 기준으로 데이터가 외부로 나가는것 
	//표준출력 : 표준 출력장치로 데이터가 나가는 것
	// -system.out 을 사용한다
	System.out.print("Hello");
	System.out.println("World");
	System.out.println();
	System.out.print("Hello");
	System.out.println();
	//ln이 엔터임 
	
	//c언어 방식
	System.out.printf("hello");
	System.out.printf("World");
	System.out.println();
	System.out.printf("%d + %d = %d\n", 10 , 20 , 30);
	int a= 10;
	int b = 20;
	int c = a+ b;
	System.out.printf("%d + %d = %d\n", a , b , c); // C언어로 하면이렇게 됨
	System.out.println(a +" + "+b + " = "+c); // 어떤게 더좋을지는 선택 
}
}
