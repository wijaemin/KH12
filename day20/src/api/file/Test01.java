package api.file;

import java.io.File;

public class Test01 {
public static void main(String[] args) {
	//파일(File) 제어
	//=파일은 무엇인가?		글자를 저장하는 저장소
	// 								파일이 크다는 것은 보관하는 글자가 많다는 뜻이다.
	//								글자 하나 당 1byte(자바에서 byte로 사용)
	//=폴더는 무엇인가?		파일을 구분하기 위한 장치
	//								디렉터리(directory)라고 부름
	//								폴더는 크키가 없다(내부파일의 합계)
	//=자바에서 파일과 폴더는 어떻게 처리하는가?
	//								java.io 패키지(블로킹 방식)
	//								java.nio 패키지(논블로킹 방식)
	
	//File 클래스 객체 생성
	File a = new File("D:/text.txt");
	File b = new File("D:/","text.txt");
	
	//파일 정보 분석
 System.out.println(a.exists()); //파일이 올바르게 있는 지 확인하는 방법
 System.out.println(b.exists());
 System.out.println(a.isDirectory()); //디렉토리인지 유무
System.out.println(a.isFile());//파일인지 유무
if(a.isFile()) {
	System.out.println(a.getName()); //파일 이름 물어보기
	System.out.println(a.getPath()); //위치 물어보기
	System.out.println(a.length()); //파일의 크기 또는 들어있는 글자의 개수
	System.out.println(a.lastModified()); //최종 수정시각 밀리초단위
}

	
}
}
