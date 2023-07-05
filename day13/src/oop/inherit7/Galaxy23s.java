package oop.inherit7;

public class Galaxy23s extends Galaxy{

	public Galaxy23s(String number, String color) {
		super(number, color);
		
	}
//추상 클래스를 상속받으면 추상메소드를 해결(재정의 오버라이딩)해야 한다

	@Override
	public void samsungPay() {
System.out.println("dd");
		
	}

	@Override
	public void call() {

		
	}

	@Override
	public void sms() {
		
	}
	public void bixby() {}
}
