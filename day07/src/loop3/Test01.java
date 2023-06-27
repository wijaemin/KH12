package loop3;

public class Test01 {
	public static void main(String[] args) {
//while 반복문
//횟수를 모를때 사용
// 종료시점을 알때 사용
		
		//ex) for구문과 비교(1부터 10까지 출력)
		for(int i= 1; i <=10; i++) {
			System.out.println("for = "+ i);
		}
		int n =1;
		while (n <=10) {
System.out.println("while = " +n);
			n++;
		}
	}
}
