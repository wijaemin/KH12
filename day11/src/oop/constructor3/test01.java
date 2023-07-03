package oop.constructor3;

public class test01 {
	public static void main(String[] args) {
		game a = new game("헤라클래스", "전사", 50);
		game b = new game("포세이돈", "마법사", 20);
		game c = new game("아프로디테", "마법사", 1);

		a.show();
		b.show();
		c.show();
	}

}
