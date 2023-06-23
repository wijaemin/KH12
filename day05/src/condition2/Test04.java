package condition2;

import java.util.Scanner;

public class Test04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int price = 100000;
	System.out.print("여행가실 인원은 몇명이십니까?");
	int people = sc.nextInt();
	System.out.print("총 몇박 여행가시나요? ");
	int day = sc.nextInt();
	System.out.print("가고싶은 달을 입력해주세요 : ");
	int season = sc.nextInt();
	System.out.println(" ");
	sc.close();
	int pay =  price * people * day ;
	int disscount = 0;
	int totalPay = pay - (pay * disscount)/100;
	if (season ==12 || season <=2) { disscount = 5;
			System.out.println("현재 1박 여행비는" + price +"원 입니다.");
			System.out.println("겨울이라 할인 율은 " +disscount + "% 입니다." );
			System.out.println("총 여행 경비는 "  +totalPay+"원 입니다.");
	}
		else if (season <=5) { disscount =20;
			System.out.println("현재 1박 여행비는" + price +"원 입니다.");
			System.out.println("봄이라 할인 율은 " +disscount + "% 입니다." );
			System.out.println("총 여행 경비는 "  +totalPay+"원 입니다.");
		}
		else if (season <=8) { disscount =10;
			System.out.println("현재 1박 여행비는" + price +"원 입니다.");
			System.out.println("여름이라 할인 율은 " +disscount + "% 입니다." );
			System.out.println("총 여행 경비는 "  +totalPay+"원 입니다.");
		}
		else { disscount =30;
			System.out.println("현재 1박 여행비는" + price +"원 입니다.");
			System.out.println("가을이라 할인 율은 " +disscount + "% 입니다." );
			System.out.println("총 여행 경비는 "  +totalPay+"원 입니다.");
	}

}
}
