package oop.multi2;

public class Drone implements Electronic, Transportation, Flyable {

	@Override
	public void fly() {
		System.out.println("드론은 비행가능 합니다.");

	}

	@Override
	public void move() {
		System.out.println("드론은 움직일 수 있습니다.");
	}

	@Override
	public void powerOn() {
		System.out.println("드론의 전원 작동 시작");

	}

	@Override
	public void powerOff() {
		System.out.println("드론의 전원 작동 종료");

	}

}
