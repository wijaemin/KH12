package oop.method6;

public class test01 {
	public static void main(String[] args) {
		grade a = new grade();
		grade b = new grade();
		grade c = new grade();
		grade d = new grade();

		a.setup(1, 1, "마리오", 50, 60, 50);
		b.setup(1, 1, "루이지", 60	, 90, 50);
		c.setup(1, 2, "쿠파", 70, 70, 80);
		d.setup(1, 2, "요시", 80, 85, 35);

		a.show();
		b.show();
		c.show();
		d.show();
	}
}
