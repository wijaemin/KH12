package api.collection2;

import java.util.Random;
import java.util.TreeSet;

public class Test02 {
public static void main(String[] args) {
	Random r = new Random();
	TreeSet<Integer> rotto= new TreeSet<Integer>();
	
	for(int i = 0; i<6; i++) {
		int ran = r.nextInt(45)+1;
		if(rotto.contains(ran)) {
			i--;
		}
		rotto.add(ran);
	}
	System.out.println("이번주 로또 번호 입니다.");
	System.out.println(rotto);
	
}
}
