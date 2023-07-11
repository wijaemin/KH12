package api.time;

import java.util.Calendar;
import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int dday = 100;
		c.add(Calendar.DATE, dday - 1);
		int year = c.get(Calendar.YEAR);
		int mon = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		System.out.println("다이어트 100일 후는 \n" + year + "년 " + mon + "월 " + date + "일 입니다.");

	}
}
