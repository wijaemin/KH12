package loop;

import java.util.Iterator;

public class Test06 {
	public static void main(String[] args) {
		// 반복 범위의 변화를 줘서 다양한 반복을 구현

		// 10부터 0까지 숫자가 줄어들어 출력하도록 구현
		for (int i = 10; i >= 0; i = i - 1) {//i--
			System.out.println("i = "+i);
		}
		// 10분의 1씩 줄어들며 출력하는 반복문 구현
		for (int i =12345; i>0; i= i/10) { //i/=10
			System.out.println(i);
		// 2배씩 늘어나는 반복문 구현
			for(int i1 = 1; i1<=15346; i1*=2) {//i= i*2
				System.out.println(i1);
			}
			
		}
	}
}