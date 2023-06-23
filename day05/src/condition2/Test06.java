package condition2;

import java.util.Scanner;

public class Test06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("당신의 키를 입력하세요 : ");
	double hight = sc.nextInt();
	System.out.print("당신의 몸무게를 입력하세요 : ");
	double kg = sc.nextInt();
	double bmi =  kg / ((hight/100) * (hight/100));
   System.out.println(bmi);
sc.close();

	if (bmi <=18.5d) System.out.println("저체중");
	if (bmi <=23d) System.out.println("정상");
	if (bmi <=25d)System.out.println("과체중");
	if (bmi <=30d) System.out.println("경도비만");
	else System.out.println("중증도 비만");
		
	
		
	
	
}

}
