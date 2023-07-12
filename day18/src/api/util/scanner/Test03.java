package api.util.scanner;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
	//Scanner와 정규표현식을 결합하여 패턴을 분석
	
	String color = "빨강/주황+노랑=초록-파랑%남색*보라";
	
	Scanner sc =new Scanner(color);
	
	sc.useDelimiter("[\\+\\/\\=\\-\\%\\*]");
	
	while (sc.hasNext()) {
		System.out.println(sc.next());
	}
	
	
	sc.close();
}
}
