package oop.multi2;

public class Airplane implements Transportation, Flyable, Reserve {

	@Override
	public void reservation() {
		System.out.println("비행기는 예약 할 수 있습니다.");

	}

	@Override
	public void fly() {
		System.out.println("비행기는 날 수 있습니다.");

	}

	@Override
	public void move() {
		System.out.println("비행기는 움직일 수 있습니다.");

	}

}
