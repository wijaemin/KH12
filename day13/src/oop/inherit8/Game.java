package oop.inherit8;

public abstract class Game {
	protected int level;
	protected final String ID;

	public abstract void attack();

	public abstract void move();

	public abstract void shop();

	Game(String ID) {
		this.ID = ID;
		this.setLevel(level);
	}
	Game(String ID, int level) {
		this.ID = ID;
		this.setLevel(level);
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level==0 || level<0)
		this.level = 1;
		else this.level = level;
	}

	public void show() {
		System.out.println("");
		System.out.println("===<캐릭터 정보>===");
		System.out.println("아이디 : " + ID);
		System.out.println("레벨 : " + level);
	}
}
