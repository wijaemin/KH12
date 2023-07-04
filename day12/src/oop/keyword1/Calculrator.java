package oop.keyword1;

public class Calculrator {
// 필드
	private int left;
	private int right;
	
	//세터 + 게터 생성
	
	public int getTotal() {
		return this.left+this.right;
	}
	//생성자
	public Calculrator(int left, int right) {
	this.left=left;
	this.right=right;
	}
	
}
