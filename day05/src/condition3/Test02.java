package condition3;

public class Test02 {
public static void main(String[] args) {
	//swich - case 구문
	
	//입력 -월 정보
	int month= 8;
	
	switch(month) {//month에 잇는 값을 토대로 실행지점을 찾는다.
	case 12:
	case 1:
	case 2://month 가 2인경우 실행할 곳
	System.out.println("겨울");
		break; // 그만하고 나가라 
case 3://month 가 3인경우 실행할 곳
			
case 4:
case 5: System.out.println("봄");
break;
case 6:
case 7:
case 8: System.out.println("여름");
break;
default:System.out.println("가을"); //else 문
break;
	}
}
	
	}
	 


