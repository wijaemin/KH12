package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> gameName = new ArrayList<>();
		ArrayList<String> typeList = new ArrayList<>();
		System.out.println("인원을 입력해주세요.");
		int people = sc.nextInt();
		System.out.println(people + "명 선택하셨습니다.");

		for (int i = 0; i < people; i++) {
			System.out.println("이름을 입력해주세요 : ");
			String name = sc.next();
			gameName.add(name);
		}

		for (int i = 0; i < people; i++) {
			System.out.println("항목을 입력해주세요 : ");
			String name = sc.next();
			typeList.add(name);
		}

		//Collections.shuffle(gameName);
		Collections.shuffle(typeList);
		
		
		
		for (int i = 0; i < people; i++) {

			List<String> total = gameName.subList(0, i);
			List<String> total2 = typeList.subList(0, i);
			System.out.println(gameName.get(i) + "---->" + typeList.get(i));
		}
	}
}
