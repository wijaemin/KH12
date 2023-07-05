package oop.inherit8;

//두개의 캐릭터로 서로간의 전투를 하도록 처리하는  클래스
// 거래 / 전투 등등

public class Interaction {

	// 전투 기능
	public static void battle(Warrior a, Archer b) {
		a.attack();
		b.attack();
	}

	String[] array = { "Warrior a,", "Archer b", "Magician c", "Warrior d,", "Archer e", "Magician f" };

	void fight() {
		for (int i = 0; i < array.length/2; i++) {

		}
	}
}
