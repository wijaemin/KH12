package oop.inherit8;

public class Warrior extends Game {
	Warrior(String ID) {
		super(ID);
		
	
	}
	Warrior(String ID, int level) {
		super(ID, level);
	}


	@Override
	public void attack() {
		System.out.println("전사가 칼로 공격합니다!");

	}

	@Override
	public void move() {
		System.out.println("전사가 뛰어서 이동합니다!");
	}

	@Override
	public void shop() {
		System.out.println("전사가 상점을 개설합니다!");

	}

}
