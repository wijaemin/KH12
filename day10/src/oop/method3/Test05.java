package oop.method3;

public class Test05 {
public static void main(String[] args) {
	data one= new data();
	data two= new data();
	data three= new data();
	
	one.setup("SK","5G언택트 52",52000, 200, 1000,2000);
	two.setup("KT","5G세이브",45000, 100, 900,1500);
	three.setup("LG","5G시그니처",130000, 500, 2000,2500);
	System.out.println("통신사 요금제 정보");
	System.out.println("통신사    	상품명	 월정액 	데이터(GB) 	통화(분)	 문자(건)");
	one.show();
	two.show();
	three.show();
	
}
}
