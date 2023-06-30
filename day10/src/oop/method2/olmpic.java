package oop.method2;

public class olmpic {
	String name;
	String type;
	String weather;
	int gold;
	int sliver;
	int bronze;

	void setup(String name, String type, String weather, int gold, int sliver, int bornze) {
		this.name = name;
		this.type = type;
		this.weather = weather;
		this.gold = gold;
		this.sliver = sliver;
		this.bronze = bronze;
	}

	void show() {
		System.out.print(this.name + "   ");
		System.out.print(this.type + "   ");
		System.out.print(this.weather + "         ");
		System.out.print(this.gold + "         ");
		System.out.print(this.sliver + "         ");
		System.out.println(this.bronze);
	}

}
