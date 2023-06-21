package data3;

public class Test07 {
public static void main(String[] args) {
	int year = 2000;
	boolean leapYear = year%4 ==0;
	
	boolean hundredYear = year%100 >0;
	
	boolean fourhundredYear = year%400==0;
	
	
	
	boolean totalLeapYear = leapYear && hundredYear || fourhundredYear;


	System.out.println(totalLeapYear+ "윤년"); 
}

}
