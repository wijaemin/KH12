package oop.inherit5;

public class GalaxyFold4 extends Galaxy {


//+@

	public void show() {
		System.out.println("<휴대폰 정보>");
		System.out.println("번호 :"+this.number); //자식클래스의 번호
		System.out.println("번호 :"+super.number); // 부모클래스의 번호
		System.out.println("번호 :"+number);} // 말안하면 this로 처리
		
		// 매소드 재정의(오버라이딩)
		// 상속받은 메소드를 똑같이 한번더 만들어서 
		// 내가 만든게 실행되도록 하는 기법이다.
		// 상속받은 메소드가 맘에 안들떄 사용
	@Override//언노테이션-역할을 부여하는 코드(해시 태그랑 비슷) 
	public void call() {
		System.out.println("갤럭시 폴드 4의 통화 기능 실행!");
	}
	// 부모클래스에 생성자가 있다면 자식클래스에 생성자가 있어야한다.
	// -부모클래스에 필요로 하는 값을 전달해야 한다.
	public GalaxyFold4(String color) {
		super(color);
	}
}
