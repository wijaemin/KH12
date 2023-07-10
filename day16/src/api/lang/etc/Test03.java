package api.lang.etc;

import java.util.Properties;

public class Test03 {
	public static void main(String[] args) {
//system 클래스 
		// 외부 시스템(운영체제, OS)과 연결되는 정보들을 가진 클래스
		// 객체 생성불가 및 모든 구성요소가 static

		// 필드
		// system. err -표준 에러 스트림(통로)
		// system.out -표준 출력 스트림(통로)
		// system.in -표준 입력 스트림(통로)

		// 스트림 마다 용도가 정해져 있으며 혼합하여 사용하는 것을 금지
		System.out.println("hello");
		System.err.println("hello");

		// 메소드

		// 시간측정 메소드
		// 프로그래밍에서는 기준시각이라는 것이 존재
		// 1970년 1월 1일 0시 0분 0초
		// 기준시로 부터 현재까지 흘러온 총시간을 밀리초로 변환
		// 시간차를 계산할수 있도록 long 형태로 반환
		long start = System.currentTimeMillis();
		System.out.println("시작은 ? " + start);

		// 시스템의 정보를 읽을수 있다.
		Properties prop = System.getProperties();
		System.out.println(prop.getProperty("user.country")); //지역
		System.out.println(prop.getProperty("user.language")); //언어
		System.out.println(prop.getProperty("os.name"));// 운영체제

		String  osName = prop.getProperty("os.name");
		String a = "Window";

		if (osName.startsWith(a))
		{
			System.out.println("윈도우를 사용중이시네요");
		}
		
		System.out.println(prop.getProperty("java.version"));//자바 버전
		
		System.out.println(prop.getProperty("user.home")); //사용자 기본폴더
	
	//3. 프로그램 종료를 요청할 수있다.
		//종료 상태를 정수로 전달할수 있다.
		// =0은 정상종료, 0이 아니면 비정상종료 로 인식함
		// 오류 상태 번호는 정하기 나름이다.
	 System.exit(0);
	 System.out.println("이 메세지는 나오지 않습니다.");
	
	}
	
}
