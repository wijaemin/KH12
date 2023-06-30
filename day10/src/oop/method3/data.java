package oop.method3;

public class data {
String company;
String promotion;
int pay;
int GB;
int call;
int text;

void setup (String company, String promotion, int pay, int GB, int call, int text) {
	this.company = company;
	this.promotion = promotion;
	this.pay = pay;
	this.GB = GB;
	this.call = call;
	this.text = text;
}
void show () {
	System.out.print(this.company+"    ");
	System.out.print(this.promotion+"       ");
	System.out.print(this.pay+"         ");
	System.out.print(this.GB+"         ");
	System.out.print(this.call+"          ");
	System.out.println(this.text);
}
}
