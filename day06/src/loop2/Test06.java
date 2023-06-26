package loop2;

public class Test06 {
	public static void main(String[] args) {
		// 누적 합계 구하기
		// 문제1 10을 10번 더하면 얼마에요?
		int total = 0;
		// total += 10;
		for (int i = 0; i < 10; i++) {
			total += 10;
			// System.out.println(total);
		}
		// System.out.println(total); // 최종 더한 값이 출력되는 구조

		// 문제2 1부터 10까지 더하면 얼마에요?
		total = 0;
		for (int k = 1; k <= 10; k++) {
			total += k; // total= total +k 10번 반복한다
			System.out.println(total += k); // total = total + k
		}
		System.out.println(total);
	}
}
