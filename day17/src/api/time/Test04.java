package api.time;

import java.util.Calendar;

public class Test04 {
	public static void main(String[] args) {
		// Calendar의 장점
		// 1900년이 기준이 아니기 때문에 일반적인 연도 설정가능
//범위를 벗어나도 자동으로 가능한 값으로 변환된다(계산 특화)
		
		Calendar c = Calendar.getInstance();
		
//항목별로 설정	
		c.set(Calendar.YEAR, 2000);
		c.set(Calendar.MONTH, 0); // 1월이 0부터 시작하므로 주의해야한다
		c.set(Calendar.DATE, 1); // 1일은 1일로 설정되어있다. 구분해야 할듯
		c.set(2000, 0,100);// 위에 3개를 저걸 한번에 통합 
		// 항목별로 추출하여 출력
		int year = c.get(1);
		int year1 = c.get(Calendar.YEAR); // 둘다 가능
		System.out.println(year1 + "년");

		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month + "월");
		int day = c.get(Calendar.DATE);
		System.out.println(day + "일");
		
		System.out.println("");
		
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour + "시");
		int min = c.get(Calendar.MINUTE);
		System.out.println(min + "분");
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec + "초");

	}
}
