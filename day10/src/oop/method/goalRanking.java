package oop.method;

public class goalRanking {
int ranking;
String name;
String nation;
int goal;

//멤버 메소드 - 공통코드
//void 이름(){코드}

//초기화용
//설정될 값을 알수 없으므로 외부에서 전달받아서 초기화
// 매개변수라고 한다
void setup(int ranking, String name, String nation, int goal) {
	this.ranking = ranking;
	this.name=name;
	this.nation=nation;
	this.goal=goal;
}
void show() {
	//this 클래스의 멤버를 의미(내꺼)
	System.out.print(this.ranking+ "   ");
	System.out.print(this.name+ "      ");
	System.out.print(this.nation+ "   ");
	System.out.println(this.goal);
}

}



