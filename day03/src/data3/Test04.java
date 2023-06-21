package data3;
// 논리연산자
public class Test04 {
public static void main(String[] args) {
	// 청소년 판정프로그램
	// 14살 이상 19세 이하
	int age = 15;
	//boolean teen = 14 <= age <= 19; 불가능 파이썬은 가능 
	boolean teen = 14<= age && age <=19;
	System.out.println(teen);
//&& (그리고) 둘다 만족해야 트루값
	//||(또는 ) 둘중 하나만 만족해도 트루값
	
	boolean teens = 14<= age || age <=19;
	System.out.println(teens);
}
}
