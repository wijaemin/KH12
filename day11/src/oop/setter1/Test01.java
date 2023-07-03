package oop.setter1;

public class Test01 {
public static void main(String[] args) {
	Student a = new Student();
	
	a.setup("피카츄", 70);
	// 데이터를 설정하는 부분에 조건을 추가한다.
	// 첫번째 잘못된 데이터 설정 가능
	// 두번째 하나의 정보만 바꿀수 없다.
	a.setup("피카츄", 50); //점수바꾸고 싶은데 이름까지 적어야한다.
	a.setup("라이츄", 50); // 이름을 바구고 싶은데 점수까지 바까야한다
	//데이터를 하나만 설정할수있는메소드를 만든다(setter 메소드)
	a.show();
}
}
