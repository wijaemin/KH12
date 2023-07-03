package oop.setter1;

public class Student {
	// 필드가 만들어져야 클래스의 나머지 형태를 구성할수 있다.
	String name;
	int score;

// 메소드 -setup, show
	void setup(String name, int score) {
		this.setName(name); //내가가진 메소드를 불러서 호출하여 몰아준다.
		this.setScore(score);
	}

	void show() {
		System.out.println(this.name);
		System.out.println(this.score);
	}

//필드를 하나씩 변경할수있는 메소드를 구현
//=Setter메소드
//set+필드명으로 이름짓는다.
// 설정 외에는 다른작업을 하지 않는다.
	void setName(String name) {
		switch (name) {//문자열은 비교를 스위치로 한다(if로 하는법은 나중에)
		case "피카츄":
		case "라이츄":

			this.name = name;
		}
	}
	// (중요) 올바른 데이터만 설정가능하도록 필터링 처리를 한다.
	void setScore (int score){
		if(score >=0 && score<=100) {
		this.score = score;}
	}
}
