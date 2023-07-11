package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		System.out.println("년도를 입력하세요 ");
		int year = sc.nextInt();
		System.out.println("달를 입력하세요 ");
		int mon = sc.nextInt();
		c.set(year, mon - 1, 1);

		int week = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, -(week - 1));

		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E");

		System.out.println("달력의 시작날짜는 : " + fmt.format(d));
		
		
		int count = 0;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i < 42; i++) {
			Date d1 = c.getTime();

			SimpleDateFormat fmt1 = new SimpleDateFormat("d");
			System.out.print(fmt1.format(d1));
			System.out.print("\t");

			c.add(Calendar.DATE, 1);
			count++;
			if (count % 7 == 0) {
				System.out.println("");
			}

		}
	}
}
