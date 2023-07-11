package api.format;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Test01 {
	public static void main(String[] args) {
//DecimalFormat 
		// 10진수를 출력하는 형식 클랙스
// 0은 자리수를 확보할때 필요한 기호(소수점을 표현할때 쓴다)
		// #은 0인 자리를 출력하지 않음
		// ,콤마는 한개만 작성해도 패턴으로 인식됨
		
		SimpleDateFormat fnt = new SimpleDateFormat("yyyy-MM-dd"); // 비교

		double a = 1234.56789;
		DecimalFormat fmt = new DecimalFormat("#,##0.00");
		System.out.println(fmt.format(a));
	}
}
