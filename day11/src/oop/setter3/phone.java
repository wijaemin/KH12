package oop.setter3;

public class phone {
	String model, company;
	int price, limit;

	void setup(String model, String company, int price, int limit) {
		this.model = model;
		this.setCompany(company);
		this.setPrice(price);
		this.setLimit(limit);
	}

	int getLimit() {
		return this.price / this.limit;
	}

	int getDiscount() {
		return (int) (this.price-this.price *0.05);
	}

	void show() {
		System.out.println("==================");
		System.out.println("모델명 : "+this.model);
		System.out.println("통신사 : "+this.company);
		if (limit == 0) {
			System.out.print("할인 적용! 가격 : " +getDiscount() + " 만원");
			System.out.println("(약정없음)");
			System.out.println("약정 개월 : 설정하지 않음");
		}

		else {
			System.out.println("월 할부금 : "+getLimit() + " 만원");
			System.out.println("가격 : " +this.price + " 만원");
			System.out.println("약정 개월 : " +this.limit+" 개월");
		}
	}

	void setCompany(String company) {
		switch (company) {
		case "SK":
		case "KT":
		case "LG":
		}
		this.company = company;
	}

	void setPrice(int price) {
		if (price > 0) {
			this.price = price;
		}
	}

	void setLimit(int limit) {
		switch (limit) {
		case 0:
		case 24:
		case 36:
			this.limit = limit;}

	}

}
