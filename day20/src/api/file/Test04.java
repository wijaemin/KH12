package api.file;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
// 경로(path)
		//PC마다 설치된 디스크 환경이 다를수 있다.
		// D:/ 와 같은 절대적인 위치는 다른 PC에서 인식하지 못할 수 있다.
		// 다른 운영체제나 환경에서도 작동하는 경로를 설정하고 싶다.
		
		//= 1. 상대경로
		//= .은 현재 위치(current path)를 의미
		//=..은 상위 위치(parent path)를 의미
		
		File a = new File("sample"); //프로젝트 범위에서 경로를 탐색
		File b = new File("./sample");
		File c = new File("../dummy");
		a.mkdirs();
		b.mkdirs();
		c.mkdirs();
		
		//= 2. system클래스 활용
		System.out.println(System.getProperty("user.home")); //사용자 홈 폴더
		System.out.println(System.getProperty("user.dir"));//프로그램 실행위치
		
		File d = new File(System.getProperty("user.home"),"dummy");
		d.mkdirs();
	}
}
