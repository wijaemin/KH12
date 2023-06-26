package loop2;

public class Test07 {
	public static void main(String[] args) {

		int pushUp = 20;
		for (int i = 1; i < 30; i++) {
			pushUp = pushUp + 20;
		}
		System.out.println(pushUp);
		int total = 0;
		int pushUp1 = 10;
		for (int k = 1; k <= 30; k++) {
			pushUp1 = pushUp1 + 3;

			total += pushUp1;
			// total= pushUp1+total;//토탈을 푸쉬업개수만큼 증가처리
			System.out.println(k + "날짜" + pushUp1 + "횟수" + total);
		}
		System.out.println(total);
		System.out.println("총합은 ? " + (pushUp + total) + "개 푸시업을 했습니다.");
	}
}
