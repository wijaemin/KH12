package condition;

import java.util.Scanner;

public class Test05 {

		public static void main(String []args){
	    Scanner sc = new Scanner(System.in);
	    int speed = sc.nextInt();
	    int overSpeed =  50;
	    int penalty = 30000;
	    int speedCount = (speed - 50) / 10 ;
	    int addtionalPenalty = 10000;
	    if (speed > overSpeed && speed >= 0) {
	        int overSpeedPay = speedCount * addtionalPenalty; 
	        System.out.println("벌금은 " +(penalty + overSpeedPay)+"원 나왔습니다.");
	    }
	    else { 
	        System.out.println("과속 대상 아님");   
	    }
	}
}
