package data;

public class Test11 {
	public static void main(String[] args) {
	int endHour = 12, endMin= 25;
	int startHour = 9, startMin = 40;
	int pay=1200;
	int hour =endHour -startHour;
	int end = endHour*60 + endMin;
	int start = startHour * 60 + startMin;
	int time = end - start;
	System.out.println("요금은 "+time/60 * pay +"원 입니다.");
	System.out.println("총 이용시간은 " +time/60+"시" + time%60 + "분입니다.");
}

}
