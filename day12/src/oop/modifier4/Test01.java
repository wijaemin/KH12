package oop.modifier4;

import oop.modifier3.Student;

public class Test01 {
	public static void main(String[] args) {
//Student의 객체(인스턴스) 생성
		// 자바의 기본접근 제한은 패키지 범위로 설정
		// 패키지에 없는 것은 모르는것은 간주
		// import를 통해 알려줘서 해결가능
		// -단 import는 퍼블릭 상태일때 만 가능하다.
		Student a = new Student();
		a.setName("피카쥬");
		a.setScore(1);

	}
}
