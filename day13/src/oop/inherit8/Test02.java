package oop.inherit8;

public class Test02 {
	public static void main(String[] args) {
		Warrior a = new Warrior("테스터1");
		Archer b = new Archer("테스터2");
		Magician c = new Magician("테스터3");
		Warrior d = new Warrior("테스터4");
		Archer e = new Archer("테스터5");
		Magician f = new Magician("테스터6");
		Interaction.battle(a, b);
		
		


	System.out.println();
	}
}
