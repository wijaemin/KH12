package oop.inherit6;

public class Galaxy23s extends Samsung {
	Galaxy23s(String name) {
		super(name);
	}

	public void bixby() {
		System.out.println(name + " 음성인식 기능 실행");
	}
	public void call() {
		System.out.println(" 갤럭시 의 전화 기능 실행");
	}
	public void sms() {
		System.out.println(" 갤럭시 의 문자 기능 실행");
	}
}
