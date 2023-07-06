package oop.multi2;

public class Kickboard implements Electronic, Transportation {

	@Override
	public void move() {
		System.out.println("전동 킥보드는 움직일수 있습니다.");

	}

	@Override
	public void powerOn() {
		System.out.println("전동킥보드 전원 공급 시작");

	}

	@Override
	public void powerOff() {
		System.out.println("전동킥보드 전원 공급 종료");

	}

}
