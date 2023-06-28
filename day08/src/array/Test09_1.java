package array;

import java.util.Random;

public class Test09_1 {
public static void main(String[] args) {
	Random r =new Random();
	int count1 =0;
	for(int i=0; i<1000; i++) {
		int dice =r.nextInt(6)+1;
		if(dice ==1) {count1++;}

	}
	System.out.println("1이 나온 횟수는 ? " + count1);
}
}
