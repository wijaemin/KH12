package api.lang.etc;

public class Test02 {
	public static void main(String[] args) {
// Math 클래스
		// 객체를 의도적으로 생성불가 처리하고 전부다 static 키워드를 사용
		// 객체 없이 아무데서나 편하게 호출이 가능하도록 구성
		System.out.println(Math.PI); // 원주율
		System.out.println(Math.E);// 자연지수(exp)

		// 메소드
		System.out.println(Math.abs(10 - 20));// 절대값(absolute)
		System.out.println(Math.abs(20 - 10));

		System.out.println(Math.round(1.4)); // 반올림
		System.out.println(Math.round(1.5));

		System.out.println(Math.floor(1.4)); // 버림
		System.out.println(Math.floor(1.5)); // 버림

		System.out.println(Math.ceil(1.4)); // 올림
		System.out.println(Math.ceil(1.5)); // 올림

		System.out.println(Math.pow(2, 10)); // 2의 10제곱

		System.out.println(Math.sqrt(9));// 루트 9

		System.out.println("피타고라스의 정리 밑변 제곱 높이 제곱의 합은 빗변의 제곱과 같다 : ");
		System.out.println(Math.pow(3, 2) + Math.pow(4, 2));
		System.out.println("답은 ? " + Math.sqrt(25));
	}
}
