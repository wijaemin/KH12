package oop.getter1;

public class asdasd {
	String name;
	int korean, english;
//getter메소드 설정된 값을 반환하는 메소드
	//이름은 get+필드명 반환형은 필드의 자료형과 같다.
	//가상의 항목에 대해서 getter메소드를 만들면 계산을 간소화 할수 있다.
	void setName(String name) {
		this.name = name;
	}
	void setKorean(int korean) {
		this.korean = korean;
	}
	
	String getName() {
		return this.name;
	}
	int getKorean() {
		return this.korean;
	}
	int getTotal() {
		return this.korean+this.english;
	}
}

