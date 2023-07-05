package oop.inherit5;

// 갤럭시 시리즈의 상위 클래스
public class Galaxy {
// 공통 필드
	// 접근 제한을 주의
	// 만약 (프라이빗)을 사용한다면 이클래스에서 정한 방식으로만 이용가능
	// (프로텍트)를 사용한다면 자식클래스 만큼은 자요롭게 접근 가능 +패키지 안에서도 가능하긴함

	protected String number;
	protected String color;
	protected int price;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 공통 메소드
	// 메소드는 재정의(오버라이딩) 될수 있다.
// 기본적으로 재정의는 허용된다.
	// 다만 파이널 키워드를 붙이면 재정의를 할수없다.
	public void call() {
		System.out.println("전화 가능");
	}

	public final void battery() {
		System.out.println("배터리 표시 기능");
	}

	
	//생성자 
	//생성할때 반드시 넣어야하는 값을 지정하는 구분
	//부모클래스는 생성할일이 없는데?
	//자식클래스 객체가 생성되면 자동으로 부모클래스의 내용이 내부에 생성
	//반드시 초기화되어야하는 필드에 대한 생성자가 있을수 있다.
	//(중요)부모클래스의 생성자를 만족시키는 생성자가 자식클래스에 있어야한다.
	public Galaxy(String color) {
		this.setColor(color);
	}
}
