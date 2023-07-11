package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		Random r = new Random();
		c.set(2023, 0, r.nextInt(365)+ 1);
		Date m = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

		System.out.println(	fmt.format(m));
		int year = c.get(Calendar.YEAR);
		int mon = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		System.out.println("이번년도 랜덤은 \n" + year + "년 " + mon + "월 " + date + "일 입니다.");

	}
}
