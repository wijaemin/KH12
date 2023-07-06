package oop.inherit8;

public class Test02 extends Interaction {
	public static void main(String[] args) {
		Game a = new Warrior("테스터1");
		//Game a = new Archer("테스터2");
	//	Game a = new Magician("테스터3");
	//	Game b = new Warrior("테스터4");
		Game b  = new Archer("테스터5");
		//Game b  = new Magician("테스터6");
		
		
		Interaction.battle(a, b);
		
		


	System.out.println();
	}
}
