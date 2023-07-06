package oop.multi2;

public class Train implements Transportation, Reserve {

	@Override
	public void reservation() {
		System.out.println("기차는 예약 가능 합니다.");
	}

	@Override
	public void move() {
		System.out.println("기차는 움직일 수 있습니다.");

	}

}
