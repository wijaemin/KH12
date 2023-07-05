package oop.inherit8;

public class Test01 {
	public static void main(String[] args) {
		Warrior a = new Warrior("힘캐", 15);
		a.show();
		a.attack();
		a.move();
		a.shop();
		Magician b = new Magician("지능캐", 25);
		b.show();
		b.attack();
		b.move();
		b.shop();
		Archer c = new Archer("민첩캐");
		c.show();
		c.attack();
		c.move();
		c.shop();

	}
}
