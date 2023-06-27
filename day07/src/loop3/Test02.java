package loop3;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		// while의 활용
		// 주사위가 6이 나올때 까지 던지는 코드
		Random r = new Random();
		while (true) {  //for(;;){ 와 같다 왼쪽 오른쪽이
			int dice = r.nextInt(6) + 1;
			System.out.println("주사위 = " + dice);
			// 만약 주사위 값이 6이라면 반복을 종료하도록 조건을 성정(필수)
			if (dice == 6) {
				break;
			}
		}
	}
}
