package oop.modifier2;

public class bank {
	private String name;
	private int year, count, inPay, outPay, finish;

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
		if (count > 12) {
			this.count = count + 1;
		} else if (count == 0) {
			this.count = count + 1;
		} else {
			this.count = count;
		}
	}

	public int getInPay() {
		return inPay;
	}

	public void setInPay(int inPay) {
		if (inPay > 0) {
			this.inPay = inPay;
		}
	}

	public int getOutPay() {
		return outPay;
	}

	public void setOutPay(int outPay) {
		if (outPay > 0) {
			this.outPay = outPay;
		}
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

	public void end() {
		if (this.count == this.year * 12) {
			System.out.println("적금 만기되었습니다.");
		}

	}

	public void show() {
		next(finish);
		System.out.println("==============");
		System.out.println("예금주 이름 : " + this.name);
		System.out.println("총 납입 기간 : " + this.year + "년");
		System.out.println("현재 납입 회차 : " + this.count + "회차");
		System.out.println("월 납입 금액 : " + this.inPay + "만원");
		System.out.println("총 잔액 : " + this.outPay + "만원");
		System.out.println("만기 예상금액 : " + ((year * 12 - count) * inPay + outPay) + "만원");
		end();
	}

	public void next(int finish) { // 피니시 횟수만큼 반복
		for (int i = 0; i < finish; i++) {
			this.count += 1;
			this.outPay = this.outPay + this.inPay;
			if (this.year * 12 == this.count) {
				break;
			}
		}
	}
}