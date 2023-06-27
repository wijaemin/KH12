package random;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//랜덤(Random)
		// 뭐가 나올지 알수 없는 상태
		// 나올수 있는 범위와 형태를 지정할수 있는것이 핵심이다.
		//-로또, 주사위 (1부터 6까지의 정수)
		//도구를 이용해서 원하는 형태가 나오도록 처리
		Random r = new Random(); // 랜덤 코드
		int a = r.nextInt();// 무작위로 숫자한개 추첨하는것
		System.out.println("a =" + a);
		int b = r.nextInt(6); // 무작위로 0부터 5까지의 인트숫자중 하나 추첨하는것
	//	(0부터 시작한다 한단계 숫자 내려치기 필요)!!!
		int dice = r.nextInt(6) +1 ;
		System.out.println("dice="+dice);
		//주사위 코드 
	}
}
