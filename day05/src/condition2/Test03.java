package condition2;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("당신의 나이를 입력해주세요 : ");
	int year = sc.nextInt();
	System.out.print("몇 정류장 이동하셨습니까? ");
	int station = sc.nextInt();
	int stationPay = (station /5) * 100;
	int pay ;
	int card =500;
	
	sc.close();
	if (year >= 65) { pay = 0;
			System.out.println("지하철 요금은 " +(pay+card+stationPay) + "원 입니다.");
	}
		else if (year >=20) {pay = 1250;
			System.out.println("지하철 요금은 " +(pay+card+stationPay) + "원 입니다.");
		
	}
		else if (year >=14) {pay = 720;
			System.out.println("지하철 요금은 " +(pay+card+stationPay) + "원 입니다.");

	}
		else if (year >=8) {pay = 450;
			System.out.println("지하철 요금은 " +(pay+card+stationPay) + "원 입니다.");
	}
		else {pay= 0;
			System.out.println("지하철 요금은 " +(pay+card+stationPay) + "원 입니다.");
	}
	}		
	}

