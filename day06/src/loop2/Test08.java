package loop2;

public class Test08 {
	public static void main(String[] args) {
		int money = 1;
		int totalMoney = 0;
		for (int i = 1; i <= 30; i++) {
			System.out.println(i + "일에는 " + money + "원을 받습니다.");
			totalMoney = money + totalMoney;
			money *= 2;	
		}
		System.out.println("그동안 받은 총금액은? " + totalMoney + "원 입니다. ");

		// 40일 버전
		long money2 = 1L;
		long totalMoney2 = 0L;
		for (int k = 1; k <= 40; k++) {
			System.out.println(k + "일에는 " + money2 + "원을 받습니다. ");
			totalMoney2 += money2;
			money2 *= 2;			
		}
		System.out.println("그동안 받은 총금액은 ? " + totalMoney2 + "원 입니다. ");
	}
}
