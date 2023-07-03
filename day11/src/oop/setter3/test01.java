package oop.setter3;

public class test01 {
	public static void main(String[] args) {
		phone a = new phone();
		phone b = new phone();
		phone c = new phone();
		phone d = new phone();
		
		a.setup("갤럭시23s","SK",180, 0);
		b.setup("갤럭시23s","KT",175, 24);
		c.setup("아이폰14","LG",200, 36);
		d.setup("아이폰14", "SK",199, 0);
		System.out.println("<휴대폰 판매 정보>");
		a.show();
		b.show();
		c.show();
		d.show();
	}
}
