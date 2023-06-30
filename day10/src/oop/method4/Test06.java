package oop.method4;

public class Test06 {
	public static void main(String[] args) {
		coffeeShop a = new coffeeShop();
		coffeeShop b = new coffeeShop();
		coffeeShop c = new coffeeShop();
		coffeeShop d = new coffeeShop();

		a.setup("아메리카노","음료",2500, "행사중");
		b.setup("모카라떼","음료",3500, "-");
		c.setup("치즈케이크","디저트",5000, "행사중");
		d.setup("마카롱","디저트",3000, "-");
		

		a.show();
		b.show();
		c.show();
		d.show();
	}
}
