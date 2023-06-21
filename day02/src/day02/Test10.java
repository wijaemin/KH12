package day02;

public class Test10 {
	public static void main(String[] args) {
		// 시간은 가장작은 단뒤로 변환하여 푼다
		
		
	
	int yesterdayStudyHour = 2; //결과 2
	int yesterdayStudyMinute = 45;
    int yesterdayStudy = yesterdayStudyHour*60 + yesterdayStudyMinute; //2시간 45분
	int todayStudyHour = 1; //결과 
	int todayStudyMinute = 50;
	int todayStudy = todayStudyHour*60 + todayStudyMinute; // 1시간 50분
	int time=todayStudy+ yesterdayStudy;
	int totalMinute =time %60; //
	int totalHour = time /60 ; 
	System.out.println( totalHour+"시"+ 
			totalMinute+"분입니다");
	System.out.println(todayStudy + yesterdayStudy);
}

}
