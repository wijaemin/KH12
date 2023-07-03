package oop.modifier2;

public class test01 {
public static void main(String[] args) {
	bank a =new bank("유재석", 3, 15, 100,1500);
	bank b =new bank("강호동", 2, 5, 50,250);
	bank c=new bank("신동엽", 2, 8, 80,1000);
	
	a.show();
	b.show();
	c.show();
}
}
