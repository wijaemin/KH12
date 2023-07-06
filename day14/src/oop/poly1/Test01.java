package oop.poly1;

import java.util.Scanner;
public class Test01 extends notebook {
	Test01(java.lang.String name) {
		super(name);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.맥북	||	2.갤럭시북");
		System.out.println("선택하세요.");
		String a = sc.next();
		notebook c = new notebook(a);
		c.show();
		System.out.println("1.전원	||	2.비디오	||	3.타이핑");
		System.out.println("선택하세요.");
		int b = sc.nextInt();
		sc.close();
		c.power(b);
		c.video(b);
		c.typing(b);
	}
}
