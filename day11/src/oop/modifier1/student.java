package oop.modifier1;

public class student {
	//필드는 접근을 차단해야 한다(private)
// 같은 클래스 내부에서는 접근이 가능해야 한다.
private	String name;
private int score;
//필드를 제외한 나머지는 공개(퍼블릭)
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}

//생성자도 퍼블릭

}
