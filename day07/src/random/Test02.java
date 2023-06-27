package random;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		Random r = new Random();
		int rotto = r.nextInt(45) + 1;
		int tenNum = r.nextInt(90) + 10;
		int otp = r.nextInt(1000000) ;

		System.out.println("로또 번호는 ? " + rotto);
		System.out.println("100미만 수는 ? " + tenNum);
		System.out.println("OTP 숫자는 ? " + otp);
		int t = r.nextInt(2);
		if (t == 0) {
			System.out.println("앞");
		} else {
			System.out.println("뒤");
		}
 int g=r.nextInt(3);
		if (g == 0) {
			System.out.println("가위");
		} else if (g == 1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
	}

}
