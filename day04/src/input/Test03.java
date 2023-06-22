package input;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("국어 점수는 입력하세요 : ");
	int Kor = sc.nextInt();
	System.out.print("영어 점수는 입력하세요 : ");
	int Eng = sc.nextInt();
	System.out.print("수학 점수는 입력하세요 : ");
	int Mat= sc.nextInt();
	System.out.println(Kor+Eng+Mat);
	System.out.println("총"+Kor+Eng+Mat+ "점입니다." );
	System.out.println((float)(Kor+Eng+Mat)/3+ "평균 입니다");

}
}
