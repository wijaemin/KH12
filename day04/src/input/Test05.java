package input;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("떡볶이 구매 수량을 입력해주세요 : ");
		int riceCount = sc.nextInt();
		System.out.print("튀김 구매 수량을 입력해주세요 : ");
		int firedCount = sc.nextInt();
		System.out.print("순대 구매 수량을 입력해주세요 : ");
		int soondeaCount = sc.nextInt();
		sc.close();
		
		int rice = 3000;
		int fided = 500;
		int soondea = 2000;
		int discount = 10;
		
		int ricePay = rice *riceCount;
		int fidePay = fided * firedCount;
		int soondeaPay = soondea * soondeaCount;
		int pay = ricePay + fidePay+ soondeaPay ;
		int enventPay = pay / discount;
		int totalPay = pay - enventPay;
		
		System.out.println("총 금액은 "+ totalPay + "원 나오셨습니다.");
		
		
	}

}
