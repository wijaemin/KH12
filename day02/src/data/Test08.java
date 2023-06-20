package data;

public class Test08 {
public static void main(String[] args) {
	//정수의 특징
	
	//정수는 소수점이 없는 숫자이다.
	//int a = 3.14;
	int a = 3;
	
	//정수는 크기에 따라 여러 종류로 나뉜다.
	// byte-short-int-long 순서이다
	byte b= 10;
	
	// 크기를 벗어나면 저장이 안된다.
	byte c = 127; 
	long d= 1000000000000000000L; //long 형태에서 마지막에 L 붙인다
	System.out.println(d);
	// 정수는 순환형 구조를 가진다.
	long f = 1234567L * 1234567L;
	System.out.println(f);
	// [중요]정수끼리기 계산하면 정수가 나온다.
	int v1= 10, v2 =3 ;
	System.out.println(v1/v2);
	System.out.println(v1%v2);
} 
}
