package api.collection;

import java.util.ArrayList;

public class test02 {
	public static void main(String[] ages) {
// List 저장소
		// 순서가 있는 저장소
		// 선형 구조(시작과 끝이있는 형태)
		// ArrayList , LinkedList, Vector

		// ArrayList list = new ArrayList();
		// 자료형(Generic Type)을 지정하지 않으면 경고

		// 자료형을 지정하면서 생성
		// ArrayList<String>list = new ArrayList<String>(); //String 전용 저장소
		ArrayList<String> list = new ArrayList<>();// 약식표현 으로 가능

		// 데이터 추가
		list.add(null); // 앞에 표현을 스트링으로 지정하여 지정한 스트링으로만 넣을수 있다.
		list.add("유재석");
		list.add("이효리");
		list.add("김채원");
		list.add("유태오");
		list.add("지수");

		// 데이터를 다루는 여러가지 명령들
		// [1] 실제로 저장된 데이터 개수 확인
		System.out.println(list.size());
		// [2] 특정 데이터 유무 확인
		System.out.println(list.contains("유재석"));
		System.out.println(list.contains("강호동"));
		// [3]특정 데이터 위치 확인
		System.out.println(list.indexOf("유재석"));
		System.out.println(list.indexOf("강호동"));
		// [4] 데이터 삭제
		System.out.println(list.remove("지수"));
		System.out.println(list.remove(1));
		System.out.println(list.remove(1));
		//list.clear();// 전체 삭제
		
		// 출력
		System.out.println("list =" + list);
	}
}
