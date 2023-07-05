package oop.inherit6;

public class apple extends Phone {
	apple(String name) {
		super(name);
	}

	public void siri() {
		System.out.println(name +" 음성인식 기능 실행");
	}
}
