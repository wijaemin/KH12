package oop.inherit6;

public class Phone {
protected String number;
protected String color;
protected String name;
public void show() {
	System.out.println("전화번호 : "+number + "   색상 : "+color);
}
public void call() {
	System.out.println(name+" 전화 기능 실행");
}
public void sms() {
	System.out.println(name+" 문자 기능 실행");
}
Phone(String name){
	this.name = name;
}
}
