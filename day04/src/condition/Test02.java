package condition;

import java.time.LocalDate;
import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("당신의 출생년도를 입력해주세요 : ");
	int year = sc.nextInt();
	sc.close();
	LocalDate now = LocalDate.now();
    int thisYear = now.getYear();
	int student= thisYear - year +1 ;
	if (student == 19)  {
		System.out.println("고3 입니다.");
	}
	else if(student !=19){
		System.out.println("고3이 아닙니다.");
	}

					

}
}
