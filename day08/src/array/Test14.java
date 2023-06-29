package array;

import java.util.Iterator;
import java.util.Random;

public class Test14 {
	public static void main(String[] args) {
		int[] dataList = new int[] { 30, 50, 20, 10, 40, 60 };
		Random r = new Random();

		for (int i = 0; i < dataList.length; i++) {
			int left = i;
			int mod = r.nextInt(dataList.length);  //
			int backup = dataList[i];
			dataList[left] = dataList[mod];
			dataList[mod] = backup;
		}
		for (int i = 0; i < dataList.length; i++) {
			System.out.println(dataList[i]);
		}
	}
}
