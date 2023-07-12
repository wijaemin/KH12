package api.util.scanner;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
//Scanner 클래스
		//문자열 입력 및 분석 클래스
		//키보드 입력은 기능 중 일부분일뿐
		// 파일뿐만 아니라 홈페이지도 읽을수 있다.(웹 크롤링)
		
		String sampleString = "떳다떳다 비행기 \n 날아라 날아라 \n 떳다떳다 비행기 \n 우리 비행기";
	//	System.out.println(sampleString);
		Scanner sc = new Scanner(sampleString);
		
		//1. 단어별로 읽기 .next  띄어쓰기나 개행 등 공백을 기준
		// .hasnext()  읽을수 있나 확인 할수 있는 판정
		//2 .줄 별로 읽기 . nextLine 개행 문자 기준
		 //hasnextLine()	읽을수 있는 줄이 있는지 확인하는 판정
		while (sc.hasNextLine()) {
		System.out.println(sc.nextLine());
	}	

		
		sc.close();
	}
}
