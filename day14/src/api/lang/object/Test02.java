package api.lang.object;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// 오브젝트는 모든 클래스의 시작(조상) 이다 오브젝트에 대한 검증
		// 모든 데이터는 오브젝트로 업캐스팅이 가능하다.
		// 모든 데이터는 오브젝트로 보관이 가능하다 -아무거나
		// 즉 자료형의 특정할수 없다면 오브젝트를 써도 된다.
		Object a = 10;
		Object b = "안녕";
		Object c = new int[] { 30, 20, 10 };
		Object d = new Scanner(System.in);
		Student e = new Student(); // 내가 만든 클래스도 오브젝트를 자동 상속

		System.out.println(b instanceof String);
		System.out.println(d instanceof Scanner);
	}
}
