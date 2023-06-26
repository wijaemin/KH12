package loop2;

public class test02 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 99; i++) {
			if (i % 10 == 7 || i /10 ==7) {
				count++;
			}
		}
		System.out.println("7이 포함되어있는 숫자는? "+count);
	

}
}