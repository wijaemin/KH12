package data;

public class Test13 {
	public static void main(String[] args) {
	 int student = 27;
	 int teacher = 1;
	 int coffeePay = 2500;
	 int orderEvent = 5;
	 int orderFree = 1;
	 int coffee = (student + teacher)/orderEvent; 
	 System.out.println("무료로 "+coffee+"잔 할인 받으셧습니다.");//5
	 int totalPay = coffeePay * (teacher +student) - coffeePay * coffee;
	 System.out.println(coffeePay * (+teacher +student) - coffeePay * coffee+"원 나왔습니다");
		
		
		//KH커피숍에서는 커피 5잔당 1잔씩 무료로 제공하는 이벤트를 하고 있습니다
		//우리반 학생 27명과 강사까지 마실 커피를 주문했을 때 다음 항목을 계산하여 출력하세요

		//무료로 계산되는 커피 잔 수
		//최종 결제 금액
		//커피는 한 잔에 2500원입니다
}

}
