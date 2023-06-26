package loop2;

public class test03 {
	public static void main(String[] args) {
		int clap = 0;
		for (int i = 0; i < 99; i++) {
			boolean clap3 = i % 10 == 3 || i / 10 == 3;
			boolean clap6 = i % 10 == 6 || i / 10 == 3;
			boolean clap9 = i % 10 == 9 || i / 10 == 3;
			if (clap3 || clap6 || clap9) {
				System.out.println(i);
				
				clap++;
			}
		}
		System.out.println("박수치는 쵯수는 ? " + clap);
	}
}
