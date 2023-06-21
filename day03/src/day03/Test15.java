package day03;

public class Test15 { 
	public static void main(String[] args) {
		//변수
	int pay = 100000;
	int people = 3;
	int discount = 25;
	int day = 7;
	
	//계산식
	int envetPay = pay * people * day *discount/100;
	int totalPay = pay * people * day;
	
	//출력
	System.out.println(totalPay -envetPay +"금액 나왔습니다.");
	}
}
