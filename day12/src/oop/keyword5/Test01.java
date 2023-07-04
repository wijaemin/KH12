package oop.keyword5;

public class Test01 {
	public static void main(String[] args) {
//불변 처리(final)
		//변수는 하나의 값만 저장이 가능하며 대입하면 값을 덮어쓰기한다.
		// 최초 이후의 대입을 금지하고 싶다면 final이라는 키워드 추가;
		
		 final int a;
		
		//int a;
		
		a=10;
	//	a=30;
	//	a=20;
		System.out.println(a);
		
		}
}
