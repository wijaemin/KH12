package oop.modifier2;

public class bank {
	private String name;
	private int year, count, inPay, outPay;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		switch (year) {
		case 1:
		case 2:
		case 3:
		case 5:
		case 10:
			this.year = year;
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (count >= 12 && count > 0) {
			this.count = count + 1;
		} else if (count == 0)
			this.count = count + 1;
		else
			this.count = count;

		if (count / 12 > year && count > 0)

		{
			System.out.println("만기");
		}
	}

	public int getInPay() {
		return inPay;
	}

	public void setInPay(int inPay) {
		if (inPay > 0)
			this.inPay = inPay;
	}

	public int getOutPay() {
		return outPay;
	}

	public void setOutPay(int outPay) {
		if (outPay > 0)
			this.outPay = outPay;
	}

	public bank(String name, int year, int inPay) {

		this.name = name;
		this.setYear(year);
		this.setInPay(inPay);
	}

	public bank(String name, int year, int count, int inPay, int outPay) {
		this.name = name;
		this.setYear(year);
		this.setCount(count);
		this.setInPay(inPay);
		this.setOutPay(outPay);
	}

	int next() {count+=1;
	this.outPay = this.inPay+this.outPay;
	return count;
}
	public void show() {
		next();
		System.out.println("===KH 내집마련 적금통장 가입자 정보===");
		System.out.println("이름 : " + this.name);
		System.out.println("기간 : " + this.year + " 년");
		System.out.println("납입회차 : " + this.count + " 회차");
		System.out.println("납입금액 : " + this.inPay + " 만원");
		System.out.println("잔액 : " + this.outPay + " 만원");
	
	}

}
