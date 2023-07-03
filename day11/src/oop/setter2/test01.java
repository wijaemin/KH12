package oop.setter2;

public class test01 {
public static void main(String[] args) {
	academy java = new academy();
	academy python = new academy();
	academy web = new academy();
	
	java.setup("자바 마스터과정", 90, 1000000, "온라인");
	python.setup("파이썬 기초", 60, 600000,"온라인");
	web.setup("웹 개발자 단기완성",120,12000000, "오프라인");
	
	java.show();
	python.show();
	web.show();
}
}
