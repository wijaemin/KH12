package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		Galaxy23s a = new Galaxy23s("갤럭시23s");
		a.number = ("010-1234-4567");
		a.color = "그린";
		a.show();
		a.call();
		a.sms();
		a.samsungPay();
		a.bixby();
		System.out.println("==============");
		GalaxyFold4 b = new GalaxyFold4("갤럭시 폴드 4");
		b.number =("010-1234-4567");
		b.color = "미러 블랙";
		b.show();
		b.call();
		b.sms();
		b.samsungPay();
		b.iris();
		System.out.println("==============");
		IPhone13 c = new IPhone13("IPhone 13");
		c.number = ("010-1234-4567");
		c.color = "옐로우 노랑";
		c.show();
		c.call();
		c.sms();
		c.itunes();
		c.siri();
		System.out.println("==============");
		IPhone14 d = new IPhone14("IPhone 14");
		d.number =("010-1234-4567");
		d.color = "레드";
		d.show();
		d.call();
		d.sms();
		d.facetime();
		d.siri();

	}
}
