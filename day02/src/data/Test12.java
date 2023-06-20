package data;

public class Test12 {public static void main(String[] args) {
	int gimbobPay = 1400;
	int number = 2;
	int gimbobEvent = 1;
	int payCount = 5;
	int pay = ((payCount+gimbobEvent)/number) *  gimbobPay; //5/2
	int free = payCount -number  -gimbobEvent;
	System.out.println(pay+"원 입니다.");
	System.out.println("무료료 처리 개는 김밥은 " +free+ "입니다");
	//KH편의점에서 삼각김밥을 1+1 행사로 판매하고 있습니다
	//한 개의 가격은 1400원입니다  1400*3

	//5개를 샀을 때 다음 항목을 계산하여 출력하세요

	//무료 처리되는 개수
	//최종 구매 금액
	//참고로 아르바이트생은 절대로 한개 더 가져오라고 하지 않습니다
}

}
