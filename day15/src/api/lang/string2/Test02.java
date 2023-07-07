package api.lang.string2;

import java.util.regex.Pattern;

public class Test02 {
public static void main(String [] args) {
	//정규 표현식으로 이름 검사
	
	String name = "홍길동";
	
	String regex="^[가-힝]{2,7}$";
	boolean isvalid =Pattern.matches(regex,name);
	System.out.println("isvalid = "+isvalid);
	
}
}
