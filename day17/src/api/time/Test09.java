package api.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.Future;

public class Test09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력해주세요\nYYYY-MM-DD");
		String day = sc.next();

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		LocalDate date = LocalDate.parse(day, fmt);

		long[] days = new long[] { 100L, 200L, 300L, 400L, 500L, 600L, 700L, 365L * 2, 365L * 3, 365L * 4, 365L * 5,
				365L * 6 };

		// 출력
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("y년 M월 d일 E요일");
		for (int i = 0; i < days.length; i++) {
			LocalDate future = date.plusDays(days[i]);
			if (days[i] % 365 == 0) {
				System.out.println(days[i] / 365 + "년 뒤 = " + future.format(fmt2));
			} else {
				System.out.println(days[i] + "일 뒤 = " + future.format(fmt2));
			}
		}
		LocalDate a1 = date.plusDays(100L);
		System.out.println("100일 : " + a1.format(fmt));
		System.out.println("200일 : " + date.plusDays(200L));
		System.out.println("300일 : " + date.plusDays(300L));
		System.out.println("1주년 : " + date.plusYears(1L));
		System.out.println("2주년 : " + date.plusYears(2L));
		System.out.println("10주년 : " + date.plusYears(10L));

	}

}
