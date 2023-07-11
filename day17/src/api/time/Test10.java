package api.time;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("시작시간을 입력해주세요 :\n HH:mm");
		String start = sc.next();
		LocalTime startTime = LocalTime.parse(start);
		System.out.println("종료시간을 입력해주세요 :\n HH:mm");
		String end = sc.next();
		LocalTime endTime = LocalTime.parse(end);
		DateTimeFormatter form = DateTimeFormatter.ofPattern("HH:mm");
		startTime.format(form);
		endTime.format(form);
		ChronoUnit.HOURS.between(startTime, endTime);
		ChronoUnit.MINUTES.between(startTime, endTime);
		System.out.println("이용시간 : " + ChronoUnit.HOURS.between(startTime, endTime) + "시 "
				+ ChronoUnit.MINUTES.between(startTime, endTime) % 60 + "분");
		System.out.println("총 이용요금 : " + (ChronoUnit.HOURS.between(startTime, endTime) * 1000 +
				+((ChronoUnit.MINUTES.between(startTime, endTime) % 60) * (1000/60f)))+
				"원 입니다.");
	}
}
