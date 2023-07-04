package oop.keyword6;

import java.io.PrintStream;

public class data {
	private final String ID;
	private String passWord, name;

	data(String ID, String passWord, String name) {
		this.ID = ID;
		this.passWord = passWord;
		this.name = name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void show() {
		System.out.println("=========");
		System.out.println("아이디 : " + ID);
		hide();
		System.out.println("비밀번호 : " + passWord);
		System.out.println("닉네임 : " + name);
	}

	void hide() {
		for (int i = 2; i < this.passWord.length(); i++) {
			passWord = "*";
		}
	}
}
