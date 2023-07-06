package oop.multi2;

public class total {
	public static void main(String[] args) {
		Drone a = new Drone();
		a.powerOn();
		a.powerOff();
		a.move();
		a.fly();

		Airplane b = new Airplane();
		b.fly();
		b.move();
		b.reservation();

		Train c = new Train();
		c.move();
		c.reservation();

		Bus d = new Bus();
		d.move();
		Kickboard e = new Kickboard();
		e.powerOn();
		e.powerOff();
		e.move();
	}
}
