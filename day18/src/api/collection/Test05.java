package api.collection;

import java.util.ArrayList;

public class Test05 {
	public static void main(String[] args) {
		// 그외 알아야할 List의 명령들

		ArrayList<String> list = new ArrayList<String>();

		list.add("피카츄");
		list.add("라이츄");
		list.add("파이리");
		list.add("꼬부기");
//중간에 삽입 할수있다. 순서가 있으므로
		list.add(2, "버터풀");
		System.out.println(list);

		// 위치를 알면 해당위치의 데이터를 추출할 수있다.
		System.out.println(list.get(2)); // 인덱스 2의 데이터 를 가져와라

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("");
		
		// 확장 반복(foreach) 구문
		// 전체 반복에 특화된 반복문
		for (String name : list) {
			System.out.println(name);
		}

	}
}
