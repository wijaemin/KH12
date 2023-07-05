package oop.inherit2;

//상위 클래스, 슈퍼 클래스, 부모 클래스
//객체 생성목적이 아님
// 비슷한 클래스의 공통적인 부분들을 모아두는 클래스
public class IPhone {
	// 필드 공통적으로 필요한 필드 작성
	private String number; //전화번호
	private int price; //가격
	private String color; //색상
	
	
	
	//메소드 - 공통적인 메소드 만 작성
	
	public void call() {
		System.out.println("전화걸기");
	}
	public void camera() {
		System.out.println("사진찍기");
	}
}
