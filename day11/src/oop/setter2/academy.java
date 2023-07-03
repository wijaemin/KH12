package oop.setter2;

public class academy {
	String name;
	int hour, pay;
	String type;

	void setup(String name, int hour, int pay, String type) {
		this.name = name;
		this.setHour(hour);
		this.setPay(pay);
		this.setType(type);
	}

	void show() {
		System.out.println("===========");
		System.out.println("강좌명 :"+this.name);
		System.out.println("강좌시간 : "+this.hour);
		System.out.println("수강료 : "+this.pay);
		System.out.println("구분 : "+this.type);
	}

	void setPay(int pay) {
		if (pay > 0) {
			this.pay = pay;
		}
	}

	void setType(String type) {
		switch (type) {
		case "온라인":
		case "오프라인":
		case "혼합":
		
		this.type=type;
	}}
void setHour(int hour) {
	if(hour%30==0 && hour>0) {
		this.hour =hour;
	}
}
}
