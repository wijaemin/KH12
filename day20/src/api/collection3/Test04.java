package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
//Map 의 전체출력

		//Map<String, Integer>vote = new HashMap<>();
		Map<String, Integer>vote = Map.of("아이유",5, "피카츄",5,"영탁",4,"라이츄",2);
		
		//Map에서 Key만 보면 Set의 형태이다.
		// -> 일단 key만 추출하여 출력하고 value는 그때그때 가져와서 사용
		Set<String> names = vote.keySet(); //vote의 key만 추출하라
		for(String name : names) {
			int count = vote.get(name);
			System.out.println("이름 = "+name + "\n득표수 ="+count);
		}
		
			
	}
}
