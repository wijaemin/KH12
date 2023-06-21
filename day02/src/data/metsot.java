package data;

public class metsot {
	public static void power(int number)//Parameter
	{int b =number* number;
	System.out.println( number + "의 2승은 " + b);
		
	}
	public static void powerByExp(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent ; i++) {result= result * number;}
		// 아이가 0일때   / 익스폰트는 무조건 더 크다 조건 성립후 아이는 1플러스 한다
		// 조건성립후 리절트 값을 리절트 * 초기값만큼 곱한다
		System.out.println(number +"의 " + exponent + "승은 " +result );
	}
	public static void main(String[] args) {
	power(2);
	power(9);
	power(5);
	powerByExp(2, 3); //2*2*2
	}

}
