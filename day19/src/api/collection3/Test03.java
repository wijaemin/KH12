package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> TV = new HashMap<>();
		System.out.println("투표에 참여할 인원을 입력해주세요.");
		int people = sc.nextInt();
		int count = 0;
		for (int i = 0; i < people; i++) {
			System.out.println("투표할 이름을 입력해주세요");
			String name = sc.next();
			
			TV.put(name, count);
			if (TV.get(name).equals(name)) {
				count++;
				TV.put(name, count);
				System.out.println("확인용" + TV);
			} else if (TV.equals(name)) {
				count = 1;
				TV.put(name, count);
			
			}

		}
		System.out.println("결과를 발표 합니다.");
		System.out.println(TV);

	}
}
