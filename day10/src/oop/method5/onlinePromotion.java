package oop.method5;

public class onlinePromotion {
	String name, type;
	int pay;
	boolean event, dawn;

	void setup(String name, String type, int pay, boolean dawn, boolean event) {
		this.name = name;
		this.type = type;
		this.pay = pay;
		this.dawn = dawn;
		this.event = event;

	}

	void show() {
		System.out.println("==온라인 쇼핑몰 상품 정보==");
		System.out.println("상품명 : " + this.name);
		if (event) {
			System.out.print("(행사중)");
			System.out.println("");
		}
		System.out.println("상품분류 : " + this.type);
		if (event) {
			int eventPay = 10;

			System.out.println("판매가 : " + (this.pay - (this.pay / eventPay))+"원");
		} else {
			System.out.println("판매가 : " + this.pay+"원");

		}

		if (dawn) {
			int dawnpay = 2500;
			System.out.println("새벽 배송비 추가 " + dawnpay + "원");
			System.out.println("총 금액 : " +(dawnpay+pay)+"원");
		}
		if (dawn) {
			System.out.println("새벽배송 : 가능");
		} else {
			System.out.println("새벽배송 : 불가능");
		}

		if (event) {
			System.out.println("행사여부 :  행사중");
		} else {
			System.out.println("행사여부 : 해당없음");
		}

	}
}
