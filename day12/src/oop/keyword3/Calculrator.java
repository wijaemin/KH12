package oop.keyword3;

public class Calculrator {
// 문제점
	// 내부구조가 복잡함 --> 필드제거
	// 객체를 꼭만들어야함 -->static 키워드를 추가
	 public static int plus(int left, int right) {
		 // static 키워드가 붙은 메소드는 객체 생성 없이도 호출가능 (메모리 고정)
		return left + right;
	}
}
