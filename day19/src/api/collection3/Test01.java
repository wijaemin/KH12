package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test01 {
	public static void main(String[] args) {
//Map
		//세트 저장소(key-value 저장소)
//List, Set은 한개의 데이터를 저장하는 반면 Map은 두개를 세트로 저장
		// Key는 이름 , value는 값의 역할을 수행
		// Set에 value가 붙어있는 형태로 봐도 무방
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		//추가 add가 아닌 put이다
		map.put("황민하", 212);
		map.put("유재석", 50);
		map.put("강호동", 55);
		map.put("강호동", 52);// 키가 중복되면 기존의 밸류가 수정됨
		map.put("박명수", 52);
		map.put("정준하", 52);
		
		//검색 key/value용  검색이 따로있다.
		System.out.println(map.containsKey("유재석"));
		System.out.println(map.containsValue(51));
		
		//삭제
		//map.remove("유재석");
		//map.remove("노홍철"); //없어서 못지움
		
		//추출 
		System.out.println(map.get("박명수"));
		System.out.println(map.get("노홍철"));
		//출력
		System.out.println(map);
		System.out.println(map.size());
	}
}
