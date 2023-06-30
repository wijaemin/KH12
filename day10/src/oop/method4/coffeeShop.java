package oop.method4;

public class coffeeShop {
	String name, type, event;
	int pay;
	int eventPay = 20;

	void setup(String name, String type, int pay, String event) {
		if (event == "행사중") {
			pay = pay - (pay / eventPay);
			this.name = name;
			this.type = type;
			this.pay = pay;
			this.event = event;
		} else {
			this.name = name;
			this.type = type;
			this.pay = pay;
			this.event = event;
		}
	}

	void show() {
		System.out.println("== 커피숍 메뉴 정보 ==");
		System.out.println("이름 : " + this.name);
		if(event =="행사중") {
			System.out.print("(행사중)");
			System.out.println();
		}
		System.out.println("분류 : " + this.type);
		System.out.println("가격 : " + this.pay);
		System.out.println("행사여부 : " + this.event);
	}
}
