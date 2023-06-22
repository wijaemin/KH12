package data4;

public class Test02 {
	public static void main(String[] args) {
	//문자열(string)
		//-문자가 모여있는 형태의 데이터
		//-참조형 데이터(reference type)
		//주문제작 방식으로 처리된다(복잡한 데이터)
		//-참조변수 (예를 들면 리모컨) 이 존재하며 기능(버튼)이 제공된다.
		
String a = "hello";
		
String b = "123 ";
String c = "456";
		System.out.println(b + c); // 예외적으로 더하기 가능 계산상의 더하기가 아닌 글자끼리 붙힘
		System.out.println(a);
		System.out.println(a.length()); // 추가적으로 제공되는 기능 존재
		System.out.println(a+b+c);
String Pizza = "피자";
String text ="나는 점심에 \"피자\" 를 먹을거에요.";
		System.out.println("나는 점심에 "+Pizza+"를 먹을거에요.");
		System.out.println("나는 점심에 \"피자\" 를 먹을거에요."); // 원표시로 그다음 표현가능 키보드 엔터 윗키
		System.out.println(text);
String text2 ="안녕\n하세요"; //뒤에 n 붙히면 줄 바꿈가능 
		System.out.println(text2); 
String text3 ="김밥\t유료\t무료"	; //뒤에 t붙히면 탭버튼 가능
		System.out.println(text3);
		//	System.out.println("나는 점심에" +\Pizza/+"를 먹을거에요."); 스트링문구에 사용 불가능
	}

}
