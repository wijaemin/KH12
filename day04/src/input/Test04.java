package input;

import java.util.Scanner;

public class Test04 {public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("입실시간을 입력해주세요 : ");
	int start = sc.nextInt();
	System.out.print("퇴실시간을 입력해주세요 : ");
	int end = sc.nextInt();
	
	
	int startHour = start /100;
	int startMin = start % 100; 
	int endHour = end /100;
	int endMin = end % 100;
	int hour = endHour - startHour;
	int min =  endMin - startMin; 

	System.out.println("수업에 참여한 시간은 " + hour+"시간 "+min+"분 입니다.");
	sc.close();
}

}
