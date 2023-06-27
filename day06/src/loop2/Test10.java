package loop2;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalHour = 0;
		int totalMin = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("월요일부터 금요일까지 공부한 시간을 적어주세요 : ");
			int hour = sc.nextInt();
			System.out.println("월요일부터 금요일까지 공부한 분을 적어주세요 : ");
			int min = sc.nextInt();
			totalMin += min;
			totalHour += hour;		
		}
		sc.close();
		System.out.println("총 걸린 시간은? " + (totalHour + totalMin / 60) + "시간 입니다.");
		System.out.println("총 걸린 분은? " + totalMin % 60 + "분 입니다.");
		System.out.println("일 평균 걸린 시간은? " + (totalHour + totalMin / 60) / 5 + "시간 입니다.");
		System.out.println("일 평균 걸린 분은? " + (totalMin % 60) / 5 + "분 입니다.");
	}
}
