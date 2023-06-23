package condition2;

import java.time.LocalTime;
import java.util.Scanner;

public class Test05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("지금 작성한지 몇 초 지났습니까? ");
	int textSecond = sc.nextInt();
	LocalTime now = LocalTime.now();
	int nowSecond = now.getSecond();
	System.out.println(nowSecond); //시스템 현재 초

	int time = textSecond - nowSecond ;
	sc.close();
	
	if (time <=10 && time>0) { 
		System.out.println("작성한지 10초가 되지않은 글");
		
	}
	else if (time >10 && time <=60) {
		System.out.println("작성한지 10초 이상 1분이 되지 않은 글");
		
	}
	else if (time > 60 && (time /3600) <=1) {
		System.out.println("작성한지 1분 이상 한시간 미만인 글");
		
	}
	else if ((time/3600)>1 && (time/3600/24)<=1) {
		System.out.println("작성한지 1시간 이상 1일 미만인 글");
	
}
	else {
		System.out.println("작성한지 1일 이상인 글");
	
}	
}
}
