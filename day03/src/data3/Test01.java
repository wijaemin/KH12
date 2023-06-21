package data3;

public class Test01 {public static void main(String[] args) {
	//논리
	//수치를 기반으로 Yes / No 를 판정하기 위한 데이터 형태
	// boolean 하나 밖에 없다.
	// true Or False 로 선택 
	boolean a = true;
	boolean b = false;
	
	// 주머니에 2만원이 있다. 피자가 1만 8천원 이있는데 주문이 가능한가?
	int mymoney = 20000;
	int pizzaPay = 18000;
	boolean order =  mymoney> pizzaPay;
	System.out.println(order);
}

}
