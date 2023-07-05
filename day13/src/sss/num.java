package sss;

public class num {
	private String name;
	private int sum;

public	num(String name, int sum) {
		this.name = name;
		this.sum = sum;
	}

public	void show() {
		System.out.println("이름 " + getName());
		System.out.println("합계 " + getSum());
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSum() {
	return sum;
}

public void setSum(int sum) {
	this.sum = sum;
}
}
