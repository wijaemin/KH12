package data;

public class Test05 {
public static void main(String[] args) {
	//변수를 의미있는 이름으로 작성하여 만들기
	
	//문제에서 주어진 값을 먼저 저장 
	
	int noodle_Price = 7000;
	int champonPrice = 8000;
	int noodleCount= 2;
	int ChamponCount = 3;
	
	// 주어진 값으로 계산
	int noodleTotal = noodle_Price* noodleCount;
	int champonTotal = champonPrice*ChamponCount;
	int total =  noodleTotal +champonTotal;
	
	// 1,2번의 데이터로 문제에서 원하는 결과를 출력
	System.out.println(noodleTotal +champonTotal );
	System.out.println(total );
}
}
