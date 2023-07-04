package oop.keyword6;

public class Test01 {
public static void main(String[] args) {
	data a=new data("adminuser","admin1234","관리자");
	data b=new data("student","student1234","수강생");
	data c=new data("manager","manager1234","매니저");

	a.show();
	b.show();
	c.show();
	
}
}
