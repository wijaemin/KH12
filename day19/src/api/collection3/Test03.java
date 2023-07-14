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

		for (int i = 0; i < people; i++) {
			System.out.println("투표할 이름을 입력해주세요");
			String name = sc.nextLine();
			name =name.replace(" " ,"").toLowerCase();
			Integer count = TV.get(name);
			TV.put(name, count);
			if (count == null) {

				TV.put(name, 1);
				System.out.println("확인용" + TV);
			} else {
				TV.put(name, count + 1);
				System.out.println("확인용" + TV);
			}
		}
		System.out.println("결과를 발표 합니다.");
		System.out.println(TV);

	}
}
