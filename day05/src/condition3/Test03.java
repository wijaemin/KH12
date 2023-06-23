package condition3;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("년도를 입력해주세요 : ");
	int year = sc.nextInt();
	System.out.print("몇 월인지 입력해주세요 : ");
	int month = sc.nextInt();
	sc.close();
	int leap = year%4;
	Boolean leapYear=(leap == 0 && year % 100 != 0 && year %400 ==0);
	
	switch(month) { 
	case 1: 
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12: System.out.println("31일까지 있습니다.");
		break;
	case 4:
	case 6:
	case 9:
	case 11: System.out.println("30일 까지 있습니다.");
	break;
	default: 
		if(leapYear==true) { 
				System.out.println("(윤년)29일 까지 있습니다.");  }
			else {
				System.out.println("30일 까지 있습니다.");}
		
}
		
}}
	
	
