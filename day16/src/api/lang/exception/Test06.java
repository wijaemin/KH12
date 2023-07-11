package api.lang.exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("생년월일을 입력해주세요 : \nex)YYYY-MM형식");
			String a = sc.next();
			int year = Integer.parseInt(a.substring(0, 4));
			if (year < 1900) {
				throw new Exception("년도가 너무 오래됫습니다");
			}
			int mon = Integer.parseInt(a.substring(5, 7));
			if (mon < 1 || mon > 12) {
				throw new Exception("월은 1월에서 12월까지 입력가능합니다.");
			}
			System.out.println(year);
			System.out.println(mon);
			sc.close();
			LocalDate now = LocalDate.now();
			int nowYear = now.getYear();
			int monthValue = now.getMonthValue();
			if (nowYear - year < 0) {
				throw new Exception("너무 미래의 값을 입력하셧습니다.");
			}
			if (mon > monthValue) {
				System.out.println("현재 한국 나이는 ? " + (nowYear - year + 1) + "살");
			} else {
				System.out.println("현재 한국 나이는 ? " + (nowYear - year) + "살");
			}
			if (mon > monthValue) {
				System.out.println("현재 만 나이는 ? " + (nowYear - year) + "살");
			} else {
				System.out.println("현재 만 나이는 ? " + (nowYear - year - 1) + "살");
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("입력한 범위가 너무 짧거나 길어서 벗어났습니다.");
		} catch (NumberFormatException e) {
			System.err.println("숫자의 변환이 올바르지 않습니다.");
		} catch (Exception e) {
			System.err.println("설정 오류 입니다.");
			System.err.println(e);
		}
	}

}
