package api.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		Date a = new Date();
		SimpleDateFormat day = new SimpleDateFormat("y년 M월 d일");
		System.out.println( day.format(a));

		SimpleDateFormat time = new SimpleDateFormat("a h시 m분");
		System.out.println( time.format(a));
		
		SimpleDateFormat time1 = new SimpleDateFormat("k:mm:ss");
		System.out.println( time1.format(a));
		
		SimpleDateFormat total = new SimpleDateFormat("yyyy-MM-dd E kk:mm:ss");
		System.out.println( total.format(a));
	}
}
