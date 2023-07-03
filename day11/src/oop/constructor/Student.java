package oop.constructor;

public class Student {
String name;
int score;

//기본 생성자
// 생성만 하고 아무짓도 안함
//한개도 없으면 자동생성됨
// 생성자가 없으면 객체생성 불가

//생성자의 이름은 클래스 이름
//하는짓은 setup 메소드와 같음
//생성자 오버로딩 가능
Student(String name, int score){
	this.name =name;
	this.score=score;
}

}
