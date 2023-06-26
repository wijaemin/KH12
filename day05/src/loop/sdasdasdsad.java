package loop;

public class sdasdasdsad {
	public static void main(String[] args) {
        for (int k = 0; k < 99; k++) {
            int i = k;
            int saveI = i; //150
            while (i != 0) {
                if (i % 10 == 5) { //150%10
                    System.out.println(saveI);
                    break;
                }
                i = i / 10;  
            }
        }
    }
}