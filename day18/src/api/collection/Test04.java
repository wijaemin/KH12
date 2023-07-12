package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> rotto = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45) + 1;
			if (rotto.contains(num)) {
				i = i - 1;
			} else {
				rotto.add(num);
			}
		}
		rotto.sort(null);
		System.out.println(rotto);
	}
}
