package loop;

public class sdasdasdsad {
	public static void main(String[] args) {
		for (int k = 0; k < 161; k++) { // k=150?
			int i = k; // i 150
			int saveI = i; //150
			if (i % 10 == 5) { //150 % => 00
			//	System.out.println(saveI);
				break;
			}
			i = i / 10;
			System.out.println(150%10);
		}
	}
}