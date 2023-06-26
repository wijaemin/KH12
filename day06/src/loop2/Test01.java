package loop2;

public class Test01 {
	public static void main(String[] args) {
		// 카운트 측정, 합계 계산

		// (기존) 1부터 100 사이의 홀수를 출력
		// (변경) 1부터 100사이의 홀수가 몇개에요?

		// 1. 1부터 100사이의 홀수를 출력
		// 2. 카운트 측정
		int count = 0; // 최초카운트 0으로 설정하여 준비

		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				// System.out.println(i);
				count++;// 조건을 만족하면 카운터가 한개씩 증가한다
			}
		}
		System.out.println(count);
	}

}
