package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test07 {
	public static void main(String[] args) {
// 도우미 클래스(Collections)
		// 뒤에 s가 붙은 클래스들은 도우미 클래스이다.
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i =0; i<10;i++) {
			list.add(i);
		}

	 System.out.println(list);
	 //리스트 뒤집기(reverse)
	 Collections.reverse(list);
	 System.out.println(list);
	 //리스트 섞기(shuffle)
	 Collections.shuffle(list);
	 System.out.println(list);
	 //리스트 정렬(sort)
	 Collections.sort(list);
	 System.out.println(list);
	 
	 //ex) 로또번호 6개 추첨
		ArrayList<Integer> rotto = new ArrayList<Integer>();
		for(int i=1; i<=45; i++)
			
		{rotto.add(i);
		
		}
		Collections.shuffle(rotto);	
		List<Integer> result = rotto.subList(0, 6);
		result.sort(null);
		System.out.println(result);
	}
}
