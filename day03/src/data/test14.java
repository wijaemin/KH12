package data;

public class test14 {
	public static void main(String[] args) {
	//할인 금액 구하기
		// 300만원 컴퓨터를 20퍼센트 할인하면 얼마?
		int computer = 3000000;
int event = 20;
int eventPay = computer/ (100 /event); // 300만원 나누기 5 
int eventPays = computer* (event/100); // 300만원 나누기 5 


System.out.println(eventPay+ "할인금액");

System.out.println(computer - eventPay+ "총 금액");

System.out.println(eventPays+ "할인금액");
	}

}
