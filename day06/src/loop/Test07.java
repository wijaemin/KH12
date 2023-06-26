package loop;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.print("분을 입력하세요 : ");
		int min = sc.nextInt();
		System.out.print("초를 입력하세요 : ");
		int sec = sc.nextInt();
		int time = min * 60 + sec;

		for (int i = time; time > 0; time--) {
			int min1 = time / 60;
			int sec1 = time % 60;
			System.out.println(min1 + "분" + sec1 + "초");
		}
		//1초 대기 
	
		Thread.sleep(1000);
		System.out.println("알람시작");
	}
}
