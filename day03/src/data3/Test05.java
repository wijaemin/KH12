package data3;

import java.time.LocalDate;

public class Test05 {
public static void main(String[] args) {
	int year = 1985 ;
	LocalDate now = LocalDate.now();
	int thisyear = now.getYear(); // 현재 시스템 년도 
	int anOddNumber= (thisyear-year+1)%2;
    int condition = thisyear-year+1;
	boolean target = anOddNumber!=0 && condition >30;
	int targetYear = thisyear%2;
	boolean targetYear1 = targetYear ==1;
	boolean targetYear2 = year%2 ==1;
	boolean targetYear3 = targetYear1 == targetYear2;
	
	
	System.out.println(targetYear);
	
	
	
	
	System.out.println(target);
	System.out.println("현재 년도는 "+thisyear+ "년 입니다.");
	//System.out.println(year);
	if (target) { System.out.println("건강검진 대상자 입니다");
		
	}
	else { System.out.println("건강검진 대상자가 아닙니다.");
		
	}
}

private static void getCurrentTime() {
	// TODO Auto-generated method stub
	
}
}
