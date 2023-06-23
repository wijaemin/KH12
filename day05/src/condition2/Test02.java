package condition2;

public class Test02 {
public static void main(String[] args) {
	//그룹조건
	// -3가지 이상 중 하나의 경우를 선택하여 실행하는 상황
	// -7시 이전에 일어나면 오래걸리지만 앉아서 올수있는 버스를 탑승
	// -8시 이전에 일어나면 환승은 해야하지만 비교적 빠른 지하첦을 탑승
	// -9시 이전에 일어나면 무조건 택시를 타야한다.
	int hour = 8;
	
	if (hour <= 7) {
				System.out.println("버스 도착 시간을 알아봐줄게");	
}
		else if (hour <=8) { 
				System.out.println( "지하철 알려줄게");
	
}
		else if (hour <= 9) {
				System.out.println("택시타러 가자!");
	
}
		else {
				System.out.println("그냥 걸어가자 포기!");
	}
}
}
