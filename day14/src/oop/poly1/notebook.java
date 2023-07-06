package oop.poly1;

import java.util.Scanner;

public class notebook {
	private static final String String = null;
	String name;
	int num;

	notebook(String name) {
		this.name = name;

	}

	void show() {
		System.out.println(name + "을 선택하셨습니다.");
	}

	void power(int b) {
		if (b == 1) {
			System.out.println(name + " 전원 기능 실행!");
		} else
			return;
	}

	void video(int b) {
		if (b == 2) {
			System.out.println(name + " 비디오 기능 실행!");
		} else
			return;
	}

	void typing(int b) {
		if (b == 3) {
			System.out.println(name + " 타이핑 기능 실행!");
		} else
			return;
	}
}
