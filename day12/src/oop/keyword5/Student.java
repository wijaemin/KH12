package oop.keyword5;

public class Student {
	//필드에 파이널을 붙일수 없다 에러생김
	//생성과 동시에 초기값으로 잠겨버린다.
	//반드시 생성자가 있어야하며 파이널 항목에 값을 넣어줘야한다.
	//파이날필드는 setter메소드 생성 불가능하다.
private final String name;
private final int score;

Student(String name, int score){
	this.name=name;
	this.score=score;
}

}
